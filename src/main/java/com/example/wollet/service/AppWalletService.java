package com.example.wollet.service;

import com.example.wollet.dtos.requests.WalletDepositRequest;
import com.example.wollet.dtos.responses.WalletDepositResponse;
import com.example.wollet.exceptions.WalletNotFoundException;
import com.example.wollet.models.Wallet;
import com.example.wollet.repositories.WalletRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppWalletService implements WalletService {
    private final WalletRepository walletRepository;

    @Override
    public WalletDepositResponse walletDepositResponse(WalletDepositRequest walletDepositRequest) {
        Wallet wallet = walletRepository.findById(walletDepositRequest.getWalletId())
                .orElseThrow(() -> new WalletNotFoundException(
                        String.format("Wallet with id %s not found", walletDepositRequest.getWalletId())
                ));
        wallet.setBalance(wallet.getBalance().add(walletDepositRequest.getAmount()));
        walletRepository.save(wallet);
        WalletDepositResponse walletDepositResponse = new WalletDepositResponse();
        walletDepositResponse.setWalletId(wallet.getId());
        walletDepositResponse.setStatus("Successfully");
        walletDepositResponse.setAmount(walletDepositRequest.getAmount().toString());
        return walletDepositResponse;
    }
}