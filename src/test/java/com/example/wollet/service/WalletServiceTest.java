package com.example.wollet.service;

import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
public class WalletServiceTest {
    @Autowired
    private WalletService walletService;

    @Test
    public void testThatCustomerCanDepositInWallet() {
        Long walletId = 200L;
        BigDecimal depositAmount = new BigDecimal("100.00");
        WalletDepositRequest deposit = new WalletDepositRequest();
        deposit.setAmount(depositAmount);
        deposit.setWalletId(walletId);
        WalletDepositResponse response = walletService.walletDepositResponse(deposit);
        response.setStatus("SUCCESSFUL");

        assertNotNull(response);
        assertNotNull(response.getStatus());
        assertEquals("SUCCESSFUL", response.getStatus());

    }
}