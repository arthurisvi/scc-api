package com.scccartola.apiscc.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum KeyType {
    CPF_CNPJ("CPF/CNPJ"),
    EMAIL("Email"),
    TEL("Telefone"),
    ALEATORY("Aleatória");

    private String keyType;
}