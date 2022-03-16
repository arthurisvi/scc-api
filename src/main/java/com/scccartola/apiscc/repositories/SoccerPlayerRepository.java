package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.SoccerPlayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SoccerPlayerRepository extends JpaRepository<SoccerPlayer, Long>{
    
}
