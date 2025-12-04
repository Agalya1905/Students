package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("Student")
public class StudentController {
	@Autowired
	public StudentService ss;
	@Autowired
	public StudentRepository rs;
	@PostMapping("create")
	public Student registerStudent(@RequestBody Student s) {
		return ss.createNewStudent(s);
	}
	@PostMapping("checkin/{id}")
	public Student checkin(@PathVariable Long id)
	{
	
		Student s=ss.getExistingStudent(id);
		s.setIntime(LocalDateTime.now());
		return rs.save(s);
		
	}
	@PostMapping("checkout/{id}")
	public Student checkout(@PathVariable Long id) {
		Student s=ss.getExistingStudent(id);
		s.setOuttime(LocalDateTime.now());
		return rs.save(s);
		
	}
	
	
		
		
		
		
		
	

}
