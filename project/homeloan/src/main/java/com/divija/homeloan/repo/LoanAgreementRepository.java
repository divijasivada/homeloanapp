package com.divija.homeloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divija.homeloan.entity.LoanAgreement;


@Repository
public interface LoanAgreementRepository extends JpaRepository<LoanAgreement, Integer> {

}