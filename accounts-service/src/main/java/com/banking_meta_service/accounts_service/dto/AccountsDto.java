package com.banking_meta_service.accounts_service.dto;

import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class AccountsDto {
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
