package com.divija.homeloan.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divija.homeloan.entity.FinanceVerificationOfficer;


@Repository
public interface FinVeriOfficerRepository extends JpaRepository<FinanceVerificationOfficer, Integer> {

}