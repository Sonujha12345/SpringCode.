package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
  @Autowired
	StudentService studentservice ;
//  @PostMapping(value = "/post")
//  public String Student (@RequestBody Student student){       //new record insert
//	  studentservice.saveStudent(student);
//	  return "Student add successfully!..";
//  }
  
  
//  @PutMapping(value = "/put")
//  public String Student (@RequestBody Student student){      //update exist record
//	  studentservice.updateStudent(student);
//	  return "Student update successfully!..";
//  }
  
  @DeleteMapping("/delete/{id}")    //where id =your id 
  public String deleteStudent(@PathVariable int id) {      //Delete the record
      studentservice.deleteStudent(id);
      return "Student deleted successfully!";
  }
}
