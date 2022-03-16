package com.scccartola.apiscc.models.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tb_player_user")
public class PlayerUser extends User {
    private String whatsappNum;
}