package com.scccartola.apiscc.models.entities;

import java.time.LocalDate;

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
@Table(name = "tb_payment")
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate requestedAt;
    private LocalDate payedAt;
    @ManyToOne
    @JoinColumn(name="pix_id")
    private Pix pix;
    @ManyToOne
    @JoinColumn(name="team_premiation_id")
    private PremiationTeam premiationTeam;
}