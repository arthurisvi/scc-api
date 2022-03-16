package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.SoccerPlayerPoints;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SoccerPlayerPointsRepository extends JpaRepository<SoccerPlayerPoints, Long>{
    
}
