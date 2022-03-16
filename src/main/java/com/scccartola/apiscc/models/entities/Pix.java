package com.scccartola.apiscc.models.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.scccartola.apiscc.models.enums.KeyType;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_pix")
public class Pix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated (EnumType.STRING)
    private KeyType keyType;
    private String key;
    @OneToOne
    @JoinColumn(name="user_id")
    private PlayerUser user;
}