package com.managementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managementsystem.model.Student;
import com.managementsystem.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudnets(){
		return studentRepo.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
}
