package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/show")
	public String findAll(Model model){
		List<Student> list = studentService.findAll();
		model.addAttribute("studentList", list);
		return "index";
	}
}
