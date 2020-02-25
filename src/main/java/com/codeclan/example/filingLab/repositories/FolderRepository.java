package com.codeclan.example.filingLab.repositories;

import com.codeclan.example.filingLab.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
