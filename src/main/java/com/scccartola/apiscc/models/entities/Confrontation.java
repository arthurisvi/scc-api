package com.scccartola.apiscc.models.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Confrontation {
    private Long id;
    private List<Lineup> lineups;
}