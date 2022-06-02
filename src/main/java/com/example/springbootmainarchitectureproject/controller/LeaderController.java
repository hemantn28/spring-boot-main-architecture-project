package com.example.springbootmainarchitectureproject.controller;

import com.example.springbootmainarchitectureproject.model.Leader;
import com.example.springbootmainarchitectureproject.service.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaderController {

@Autowired
LeaderService service;

@RequestMapping(value = "add_leader_db", method = RequestMethod.POST)
public String add(@RequestBody Leader leader){
    return service.add(leader);
}

@RequestMapping(value = "get_leader_db", method = RequestMethod.GET)
public List<Leader> getAll(){
    return service.getAll();
}

}
