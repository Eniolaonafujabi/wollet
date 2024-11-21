package com.example.wollet.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
@Entity
public class Wallet {
    @Id
    private Long id;
    private BigDecimal balance;
    private String accountNumber;

    public Wallet() {
        balance = BigDecimal.ZERO;
    }
}
