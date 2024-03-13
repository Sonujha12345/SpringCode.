package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentrepository;
	@Override
	public List<Student> getStudent(){
		return studentrepository.findAll();
	}
//	@Override
//	public void saveStudent(Student student) {         //new record insert
//		studentrepository.save(student);
//	}
	
//	@Override
//	public void updateStudent(Student student) {      //update exist record
//		studentrepository.save(student);
//	}
	
	@Override
    public void deleteStudent(int id) {              //Delete the record
        studentrepository.deleteById(id);             
    }


}
