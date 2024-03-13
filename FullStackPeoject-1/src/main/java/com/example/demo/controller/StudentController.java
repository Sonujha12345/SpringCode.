package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimpl.StudentServiceimpl;

@RestController
public class StudentController {
	@Autowired
	StudentServiceimpl studentService;
	
	@GetMapping(value = "/get")
     public List<Student> getStudent() {      //multiple value retrieve or list of value
    	  return studentService.getStudent();
     }
	
	@GetMapping(value = "/get/{id}")
    public Optional<Student> getStudentById(@PathVariable int id) {   //single value retrieve or By id value
   	  return studentService.getStudentById(id);
    }
	
//	@GetMapping(value = "/get/{name}")
//    public Optional<Student> getStudentByName(@PathVariable String name) {   //single value retrieve or By name value
//   	  return studentService.getStudentByName(name);
//    }
	
	@GetMapping(value = "/getbyname/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }
	
	@PostMapping(value = "/post")
  public Student postStudent(@RequestBody Student student) {      //multiple value retrieve or list of value
 	  return studentService.postStudent(student);
  }
	
	@DeleteMapping(value = "/delete/{id}")
    public String deleteStudentById(@PathVariable int id) {   //single value retrieve or By id value
   	  return studentService.deleteStudentById(id);
    }
}
