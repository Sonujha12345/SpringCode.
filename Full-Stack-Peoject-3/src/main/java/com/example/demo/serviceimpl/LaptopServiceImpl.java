package com.example.demo.serviceimpl;

//import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Laptop;

public interface LaptopServiceImpl {
	
//	public List<Laptop> getLaptop();
	Optional<Laptop> getLaptopById(int id);
}
