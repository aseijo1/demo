package org.kappa.hibernate.job.service;

import java.util.List;

import org.kappa.hibernate.job.model.Student;
import org.kappa.hibernate.job.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public void add(Student s) {
		studentDao.add(s);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}
