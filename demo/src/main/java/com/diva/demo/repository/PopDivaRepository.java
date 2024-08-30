package com.diva.demo.repository;


import com.diva.demo.model.PopDiva;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PopDivaRepository extends CassandraRepository<PopDiva, UUID> {
}

