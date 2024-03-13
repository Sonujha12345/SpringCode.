package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public List<Student> getStudent();  //multiple value retrieve or list of value
	
	public Optional<Student> getStudentById(int id) ;  //single value retrieve or By id value
	
//	public Optional<Student> getStudentByName(String name) ;  //single value retrieve or By name value
	
	public Student getStudentByName(String name);
	
	public Student postStudent(Student student) ;
	
	public String deleteStudentById(int id) ;
		
}
