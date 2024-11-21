package com.example.wollet.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class WalletDepositResponse {
    private Long walletId;
    private String amount;
    private String status;
}
