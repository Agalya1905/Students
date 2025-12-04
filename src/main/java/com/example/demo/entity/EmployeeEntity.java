package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeeEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long eid;
     private String ename;
     private Long eno;
     
}
