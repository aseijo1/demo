package org.kappa.hibernate.job.repository;

import java.util.List;

import org.kappa.hibernate.job.model.Student;

public interface StudentDao {
	
	public void add(Student s);
	public List<Student> getAllStudents();
}
