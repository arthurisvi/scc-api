package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.Competition;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long>{
    
}
