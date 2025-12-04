package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
   public  StudentRepository rs;
	
	public Student createNewStudent(Student s) {
	
		return rs.save(s);
		
	}
	public Student getExistingStudent(Long id) {
		return rs.findById(id).get();
	}
}
