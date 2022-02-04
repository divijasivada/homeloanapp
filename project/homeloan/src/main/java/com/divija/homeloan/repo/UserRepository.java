package com.divija.homeloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divija.homeloan.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}