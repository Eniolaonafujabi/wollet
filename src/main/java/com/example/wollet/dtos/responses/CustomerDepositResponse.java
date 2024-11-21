package com.example.wollet.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDepositResponse {
    private Long customerId;
    private String message;
}
