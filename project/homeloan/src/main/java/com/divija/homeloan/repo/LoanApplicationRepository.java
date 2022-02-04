package com.divija.homeloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divija.homeloan.entity.LoanApplication;


@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

}