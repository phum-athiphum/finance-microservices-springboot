package com.banking_meta_service.accounts_service.entity;

import jakarta.persistence.Column;
import org.springframework.data.annotation.Id;

public class Accounts extends BaseEntity {
    @Column(name="customer_id")
    private Long customerId;

    @Column(name="account_number")
    @Id
    private Long accountNumber;

    @Column(name="account_type")
    private String accountType;

    @Column(name="branch_address")
    private String branchAddress;
}
