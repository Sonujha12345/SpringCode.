package com.example.demo.controller;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;
import com.example.demo.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopService laptopservice;
//	@GetMapping(value = "/get")
//	public List<Laptop> getLaptop(){
//		return laptopservice.getLaptop();
//		
//	}
	
	@GetMapping("/get/{id}")
    public Optional<Laptop> getLaptopId(@PathVariable int id) {
        return laptopservice .getLaptopById(id);
    }
}
