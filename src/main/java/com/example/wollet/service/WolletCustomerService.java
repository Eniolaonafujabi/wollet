package com.example.wollet.service;

import com.example.wollet.dtos.requests.CustomerDepositRequest;
import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.CustomerDepositResponse;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import com.example.wollet.exceptions.UserNotFoundException;
import com.example.wollet.models.Customer;
import com.example.wollet.repositories.CustormerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WolletCustomerService implements CustomerService {
        private final WalletService walletService;
    private final CustormerRepository custormerRepository;

    @Override
    public CustomerDepositResponse customerDepositResponse(CustomerDepositRequest customerDepositRequest) throws UserNotFoundException {
        Customer customer = custormerRepository.findById(customerDepositRequest.getCustomerId())
                .orElseThrow(() -> new UserNotFoundException(
                        String.format("user with id %d not found", customerDepositRequest.getCustomerId())
                ));
        customer.getWallet();
        return null;
    }

}
