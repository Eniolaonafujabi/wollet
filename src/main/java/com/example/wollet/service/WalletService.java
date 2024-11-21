package com.example.wollet.service;

import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletService {
    WalletDepositResponse walletDepositResponse(WalletDepositRequest walletDepositRequest);
}
