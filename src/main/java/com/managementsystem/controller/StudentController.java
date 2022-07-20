package com.managementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.managementsystem.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String showAllStudent(Model model){
		model.addAttribute("students", studentService.getAllStudnets());
		return "students";
	}
}
