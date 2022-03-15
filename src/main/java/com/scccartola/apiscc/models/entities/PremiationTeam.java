package com.scccartola.apiscc.models.entities;

import lombok.Data;

@Data
public class PremiationTeam {
    private Long id; 
    private Double premiationValue;
    private Team team;

}