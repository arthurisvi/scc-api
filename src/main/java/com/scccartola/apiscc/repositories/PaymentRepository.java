package com.scccartola.apiscc.repositories;

import com.scccartola.apiscc.models.entities.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
    
}
