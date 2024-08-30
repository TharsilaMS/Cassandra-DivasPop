package com.diva.demo.service;


import com.diva.demo.model.PopDiva;
import com.diva.demo.repository.PopDivaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PopDivaService {

    @Autowired
    private PopDivaRepository popDivaRepository;

    public List<PopDiva> getAllDivas() {
        return popDivaRepository.findAll();
    }

    public Optional<PopDiva> getDivaById(UUID divaId) {
        return popDivaRepository.findById(divaId);
    }

    public PopDiva addDiva(PopDiva popDiva) {
        return popDivaRepository.save(popDiva);
    }

    public void deleteDiva(UUID divaId) {
        popDivaRepository.deleteById(divaId);
    }
}

