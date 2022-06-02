package com.example.springbootmainarchitectureproject.repository;

import com.example.springbootmainarchitectureproject.model.Leader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderRepository extends JpaRepository<Leader, Integer> {
}
