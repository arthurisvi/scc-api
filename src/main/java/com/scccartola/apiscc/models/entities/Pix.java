package com.scccartola.apiscc.models.entities;

import lombok.Data;

@Data
public class Pix {
    private Long id;
    private String key;
    private PlayerUser user;
}