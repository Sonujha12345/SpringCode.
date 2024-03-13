package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;


public interface StudentService {

	public List<Student> getStudent();
//	public void saveStudent(Student student);     //new record insert
//	public void updateStudent(Student student);   //update exist record
	public void deleteStudent(int id);            // Delete the record
	
	 
}
