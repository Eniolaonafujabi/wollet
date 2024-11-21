package com.example.wollet.service;

import com.example.wollet.dtos.requests.CustomerDepositRequest;
import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.CustomerDepositResponse;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WolletCustomerService implements CustomerService {
        private final WalletService walletService;

    @Override
    public CustomerDepositResponse customerDepositResponse(CustomerDepositRequest customerDepositRequest) {
        return null;
    }
//
//    @Override
//    public WalletDepositResponse walletDepositResponse(WalletDepositRequest walletDepositRequest) {
//        return null;
//    }
}
