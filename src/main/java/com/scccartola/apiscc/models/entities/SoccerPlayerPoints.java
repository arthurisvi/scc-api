package com.scccartola.apiscc.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "tb_soccer_player_points")
public class SoccerPlayerPoints{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer round;
    private Double value;
    @ManyToOne
    @JoinColumn(name="soccer_player_id")
    private SoccerPlayer soccerPlayer;
}