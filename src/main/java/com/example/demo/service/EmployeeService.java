package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
public EmployeeRepository er;
 
public EmployeeEntity createNew(EmployeeEntity ee) {
	return er.save(ee);
}
public EmployeeEntity getExist(Long eid) {
	return er.findById(eid).get();
}
}
