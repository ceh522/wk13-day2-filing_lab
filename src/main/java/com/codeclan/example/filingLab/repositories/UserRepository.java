package com.codeclan.example.filingLab.repositories;

import com.codeclan.example.filingLab.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
