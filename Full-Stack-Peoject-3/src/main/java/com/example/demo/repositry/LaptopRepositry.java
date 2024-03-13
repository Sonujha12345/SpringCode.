package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptop;
@Repository
public interface LaptopRepositry extends JpaRepository<Laptop, Integer>{

}
