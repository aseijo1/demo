package org.kappa.hibernate.job.controller;

import java.util.Date;
import java.util.List;

import org.kappa.hibernate.job.model.Student;
import org.kappa.hibernate.job.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/")
	public String index() {
		return "app is on!";
	}
	
	@GetMapping("/students")
	public List<Student> getStudentsList() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/add")
	public void addStudent() {
		studentService.add(new Student(1L, "Artur Seixo Alonso", "33K", new Date()));
	}
}
