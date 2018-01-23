package com.springweb1.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.springweb1.bo.StudentBO;

@Repository
public class StudentDaoImpl extends AbstractDao implements StudentDao {

	@Override
	public void saveStudentDetails(StudentBO studentBO) {

		Session session = getSession();
		session.save(studentBO);
	}

}
