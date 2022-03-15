package com.scccartola.apiscc.models.entities;

import java.util.List;

import lombok.Data;

@Data
public class Lineup {
    private Long id;
    private List<SoccerPlayerPoints> soccerPlayers;
    private Integer round;
}