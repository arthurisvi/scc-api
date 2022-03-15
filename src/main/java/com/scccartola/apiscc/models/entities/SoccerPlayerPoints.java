package com.scccartola.apiscc.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SoccerPlayerPoints extends Points{
    private SoccerPlayer soccerPlayer;
}