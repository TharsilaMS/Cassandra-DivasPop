package com.diva.demo.controller;


import com.diva.demo.model.PopDiva;
import com.diva.demo.service.PopDivaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/divas")
public class PopDivaController {

    @Autowired
    private PopDivaService popDivaService;

    @GetMapping
    public List<PopDiva> getAllDivas() {
        return popDivaService.getAllDivas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PopDiva> getDivaById(@PathVariable UUID id) {
        Optional<PopDiva> diva = popDivaService.getDivaById(id);
        return diva.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public PopDiva addDiva(@RequestBody PopDiva popDiva) {
        return popDivaService.addDiva(popDiva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiva(@PathVariable UUID id) {
        popDivaService.deleteDiva(id);
        return ResponseEntity.noContent().build();
    }
}

