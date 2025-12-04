package com.example.demo.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Data


public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	private String sname;
	private LocalDateTime intime;
	private LocalDateTime outtime;
}

//	public long getSid() {
//		return sid;
//	}
//
//	public void setSid(long sid) {
//		this.sid = sid;
//	}
//
//	public String getSname() {
//		return sname;
//	}
//
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//
//	public LocalTime getIntime() {
//		return intime;
//	}
//
//	public void setIntime(LocalTime intime) {
//		this.intime = intime;
//	}
//
//	public LocalTime getOuttime() {
//		return outtime;
//	}
//
//	public void setOuttime(LocalTime outtime) {
//		this.outtime = outtime;
//	}
//
//	public Student(long sid, String sname, LocalTime intime, LocalTime outtime) {
//
//		this.sid = sid;
//		this.sname = sname;
//		this.intime = intime;
//		this.outtime = outtime;
//	}
//
//	public Student() {
//
//	}


