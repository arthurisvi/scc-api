package com.scccartola.apiscc.models.entities;

import lombok.Data;

@Data
public abstract class Points {
    private Long id;
    private Integer round;
    private Double value;
}