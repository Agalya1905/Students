package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AnimalEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 

private int aage;
private String agender;
private String aname;
}
