package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.Lineup;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LineupRepository extends JpaRepository<Lineup, Long>{
    
}
