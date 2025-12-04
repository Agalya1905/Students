package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepository;



	@Service


	public class LaptopService {
		@Autowired
		public LaptopRepository lp;
		
		public Laptop create(Laptop lap) {
			return lp.save(lap);
		}
		public Laptop get(int lid) {
			return lp.findById(lid).get();

}
		public Laptop put(int lid,Laptop l) {
			Laptop old=get(lid);
			old.setBrand(l.getBrand());
			return lp.save(old);
		}
	}
