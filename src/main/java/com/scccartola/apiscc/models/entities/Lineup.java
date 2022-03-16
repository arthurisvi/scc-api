package com.scccartola.apiscc.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_lineup")
public class Lineup {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<SoccerPlayerPoints> soccerPlayers;
    private Integer round;
    private Double points;
    @ManyToOne
    @JoinColumn (name = "team_id")    
    private Team team;
}