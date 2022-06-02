package com.example.springbootmainarchitectureproject.service;


import com.example.springbootmainarchitectureproject.model.Leader;
import com.example.springbootmainarchitectureproject.repository.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Service
public class LeaderService {

   @Autowired
   LeaderRepository repository;

   public String add(Leader leader){
   repository.save(leader);
   return "add leader db";
   }

   public List<Leader> getAll(){
      return repository.findAll();
   }
}
