package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tb2")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int bid;
   private String bname;
   private boolean bright;
   private long bprice;
   
   @ManyToOne
   @JsonBackReference
   public Laptop laptop;
   
}
