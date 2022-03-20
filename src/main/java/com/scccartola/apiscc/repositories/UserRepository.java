package com.scccartola.apiscc.repositories;

import java.util.Optional;

import com.scccartola.apiscc.models.entities.PlayerUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<PlayerUser, Long>{
    @Query("select u from PlayerUser u where u.email = :email")
    Optional<PlayerUser> findUserByEmail(@Param ("email") String email);
}