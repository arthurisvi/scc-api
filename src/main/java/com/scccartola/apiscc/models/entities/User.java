package com.scccartola.apiscc.models.entities;

import lombok.Data;

@Data
public abstract class User {
    
    private Long id;
    private String name;
    private String email;
    private String password;
}