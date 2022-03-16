package com.scccartola.apiscc.models.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.scccartola.apiscc.models.enums.Position;

import lombok.Data;

@Data
@Entity
@Table(name ="tb_soccer_player")
public class SoccerPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated (EnumType.STRING)
    private Position position;
    private String club; 
}