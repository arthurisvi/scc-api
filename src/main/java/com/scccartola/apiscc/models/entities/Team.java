package com.scccartola.apiscc.models.entities;

import lombok.Data;

@Data
public class Team {
    private Long id;
    private String name;
    private String photo;
    private PlayerUser playUser;
}