package com.divija.homeloan.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divija.homeloan.entity.LandVerificationOfficer;


@Repository
public interface LandVerOfficerRepository extends JpaRepository<LandVerificationOfficer, Integer> {

}