package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}