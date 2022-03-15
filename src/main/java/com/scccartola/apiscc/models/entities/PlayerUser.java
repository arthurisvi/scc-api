package com.scccartola.apiscc.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PlayerUser extends User {
    private String whatsappNum;
}