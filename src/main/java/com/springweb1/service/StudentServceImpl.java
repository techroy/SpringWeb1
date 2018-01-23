package com.springweb1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb1.bo.CourseBO;
import com.springweb1.bo.StudentBO;
import com.springweb1.command.StudentEnrollCommand;
import com.springweb1.dao.CourseDao;
import com.springweb1.dao.StudentDao;

@Service
public class StudentServceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Autowired
	private CourseDao courseDao;

	@Override
	public void enrollStudentDetails(StudentEnrollCommand studentEnrollCommand) {

		System.out.println("Service Layer--" + studentEnrollCommand);

		StudentBO studentBO = new StudentBO();

		studentBO.setAddress(studentEnrollCommand.getAddress());
		studentBO.setGender(studentEnrollCommand.getGender());
		studentBO.setName(studentEnrollCommand.getName());
		studentBO.setQualification(studentEnrollCommand.getQualification());

		studentDao.saveStudentDetails(studentBO);

		CourseBO courseBO = new CourseBO();

		courseBO.setCoureName(studentEnrollCommand.getCourse());
		courseBO.setDuration(studentEnrollCommand.getDuration());

		// b-- logic
		courseBO.setFees("5000");

		courseDao.saveCourseDetails(courseBO);

	}

}
