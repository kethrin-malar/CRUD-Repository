package com.example.demo.repository;

import com.example.demo.model.Database1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseRepo extends JpaRepository<Database1, Integer> {
}
