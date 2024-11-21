package com.example.wollet.service;

import com.example.wollet.dtos.requests.CustomerDepositRequest;
import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.CustomerDepositResponse;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void testCustomerCanDeposit() {
        Long customerId = 200L;
        BigDecimal amount = new BigDecimal("100.00");
        String description = "description";
        CustomerDepositRequest request = new CustomerDepositRequest();
        request.setCustomerId(customerId);
        request.setAmount(amount);
        request.setDescription(description);
        CustomerDepositResponse customerDepositResponse = customerService.customerDepositResponse(request);
        assertNotNull(customerDepositResponse);
        assertNotNull(customerDepositResponse.getMessage());
        assertEquals("SUCCESSFUL", customerDepositResponse.getMessage());
    }
}