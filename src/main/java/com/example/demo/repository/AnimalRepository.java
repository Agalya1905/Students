package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AnimalEntity;
@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity,Integer>{

}
