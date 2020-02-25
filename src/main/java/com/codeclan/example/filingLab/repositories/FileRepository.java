package com.codeclan.example.filingLab.repositories;

import com.codeclan.example.filingLab.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
