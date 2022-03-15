package com.scccartola.apiscc.models.entities;

import java.util.List;

import lombok.Data;

@Data
public class Competition {
    private Long id;
    private String name;
    private List<Team> teams;
}