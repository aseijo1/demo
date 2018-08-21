package org.kappa.hibernate.job.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.kappa.hibernate.job.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
@Transactional
@SuppressWarnings("unchecked")
public class StudentDaoImpl implements StudentDao {
	
	//cambiar por factory e entity manager como sempre, omitir PersistenceContext
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void add(Student s) {
		entityManager.persist(s);
		
	}

	@Override
	public List<Student> getAllStudents() {
		String hql = "FROM Student as s ORDER BY s.nome";
		return (List<Student>) entityManager.createQuery(hql).getResultList();
	}

	
}
