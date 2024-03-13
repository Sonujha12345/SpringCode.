package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService
 {
	@Autowired
	StudentRepository studentrep;
	
	public List<Student> getStudent() {   //multiple value retrieve or list of value
		return studentrep.findAll();
	}
	
	public Optional<Student> getStudentById(int id) {   //single value retrieve or By id value
	   	  return studentrep.findById(id);
	    }
	
//	public Optional<Student> getStudentByName(String name) {   //single value retrieve or By name value
//	   	  return studentrep.findByName(name);
//	    }
	
	public Student getStudentByName(String name) {
        return studentrep.findByName(name);
    }

	public Student postStudent(Student student) {
		Student save = studentrep.save(student);
		return save;
	}

	public String deleteStudentById(int id) {
		studentrep.deleteById(id);
		return "Delete successing..." ;
	}
}
