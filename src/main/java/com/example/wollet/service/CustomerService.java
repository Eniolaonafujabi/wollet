package com.example.wollet.service;

import com.example.wollet.dtos.requests.CustomerDepositRequest;
import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.CustomerDepositResponse;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface CustomerService {
    CustomerDepositResponse customerDepositResponse(CustomerDepositRequest customerDepositRequest);
}
