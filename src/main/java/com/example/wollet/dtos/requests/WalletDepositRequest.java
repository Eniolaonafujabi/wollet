package com.example.wollet.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class WalletDepositRequest {
    private Long walletId;
    private BigDecimal amount;
    private String description;
}
