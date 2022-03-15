package com.scccartola.apiscc.models.entities;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Payment {
    private Long id;
    private LocalDate requestedAt;
    private LocalDate payedAt;
    private Pix pix;
    private PremiationTeam premiationTeam;
}