package com.banking_meta_service.accounts_service.repository;

import com.banking_meta_service.accounts_service.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
}
