package com.example.eccomerce.entities.enums;

import lombok.Getter;

@Getter
public enum PaymentType {
    STRIPE("Stripe");

    private final String type;

    PaymentType(String type) {
        this.type = type;
    }
}
