package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AnimalEntity;
import com.example.demo.repository.AnimalRepository;

@Service
public class AnimalService {
	
	
	@Autowired
	public AnimalRepository ar;
	
	
	public AnimalEntity createanimal(AnimalEntity ae) {
		return ar.save(ae);
		
		
	}

}
