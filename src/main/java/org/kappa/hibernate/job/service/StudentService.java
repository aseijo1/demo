package org.kappa.hibernate.job.service;

import java.util.List;

import org.kappa.hibernate.job.model.Student;


public interface StudentService {

	public void add(Student s);
	public List<Student> getAllStudents();
}
