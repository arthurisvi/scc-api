package com.scccartola.apiscc.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Position {
    GOALKEEPER("Goleiro"),
    SIDE("Lateral"),
    DEFENDER("Zagueiro"),
    MIDFIELDER ("Meio-campista"),
    ATTACKER("Atacante");
    
    private String playerPosition;

}