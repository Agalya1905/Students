package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/hello")
public class EmployeeController {
@Autowired
public EmployeeService es;
@Autowired
public EmployeeRepository er;
 
@PostMapping("/hi")
public EmployeeEntity reqEmp(@RequestBody EmployeeEntity ee) {
	return es.createNew(ee);
}
@PostMapping("checkid")
public EmployeeEntity checkIn(@PathVariable Long eid) {
	EmployeeEntity ee=es.getExist(eid);
	return es.getExist(eid);
}

}
