package com.divija.homeloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divija.homeloan.entity.EMI;

@Repository
public interface EMIRepository extends JpaRepository<EMI, Integer>{

}