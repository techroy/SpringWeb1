package com.springweb1.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.springweb1.bo.CourseBO;

@Repository
public class CourseDaoImpl extends AbstractDao implements CourseDao {

	
	@Override
	public void saveCourseDetails(CourseBO courseBO) {

		Session session = getSession();
		session.save(courseBO);

	}



}
