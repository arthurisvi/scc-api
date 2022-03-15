package com.scccartola.apiscc.models.entities;

import lombok.Data;

@Data
public class SoccerPlayerPoints{
    private Long id;
    private Integer round;
    private Double value;
    private SoccerPlayer soccerPlayer;
}