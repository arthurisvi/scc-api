package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.Pix;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PixRepository extends JpaRepository<Pix, Long>{
    
}
