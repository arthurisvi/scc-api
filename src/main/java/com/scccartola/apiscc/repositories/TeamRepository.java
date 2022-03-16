package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.Team;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long>{
    
}