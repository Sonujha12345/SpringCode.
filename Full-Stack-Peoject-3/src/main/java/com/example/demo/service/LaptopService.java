package com.example.demo.service;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repositry.LaptopRepositry;
import com.example.demo.serviceimpl.LaptopServiceImpl;
@Service
public class LaptopService implements LaptopServiceImpl {
	@Autowired
	LaptopRepositry laptoprepositry;
	
//	public List<Laptop> getLaptop(){
//		return laptoprepositry.findAll();
//		
//	}
	
	@Override
    public Optional<Laptop> getLaptopById(int id) {
        return laptoprepositry.findById(id);
    }

}
