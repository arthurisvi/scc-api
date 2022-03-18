package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.PlayerUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<PlayerUser, Long>{
    
}