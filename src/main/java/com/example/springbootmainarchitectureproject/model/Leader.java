package com.example.springbootmainarchitectureproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Leader {

    @Id
    @GeneratedValue
    int id;
    int age;
    String name;
    String state;

    public Leader() {
    }

    public Leader(int id, int age, String name, String state) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
