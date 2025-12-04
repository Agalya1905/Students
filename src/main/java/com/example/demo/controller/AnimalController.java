package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AnimalEntity;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.AnimalRepository;
import com.example.demo.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	public AnimalService as;
	
	
	@Autowired
	public AnimalRepository ar;
	
    @PostMapping("/createanimal")
    public AnimalEntity ae(@RequestBody AnimalEntity ae) {
    	return as.createanimal(ae);
    }
}
