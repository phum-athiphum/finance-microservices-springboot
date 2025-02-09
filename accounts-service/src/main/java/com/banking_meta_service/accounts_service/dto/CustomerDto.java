package com.banking_meta_service.accounts_service.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDto {
    private String name;

    private String email;

    private String mobileNumber;
}
