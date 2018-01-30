package com.springweb1.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb1.command.StudentEnrollCommand;
import com.springweb1.service.StudentServceImpl;
import com.springweb1.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@ModelAttribute(name = "qualifications")
	public Map<String, String> initiliazeQualifications() {

		System.out.println("----Model qualifications----");
		Map<String, String> qualificationMap = new HashMap();
		qualificationMap.put("bca", "BCA");
		qualificationMap.put("mca", "MCA");
		qualificationMap.put("btek", "BTEK");
		qualificationMap.put("bsc", "SSC");

		return qualificationMap;

	}

	@RequestMapping(value = "/enroll", method = RequestMethod.GET)
	public String getEnrollPage(ModelMap modelMap) {

		/*
		 * Map<String, String> qualificationMap = new HashMap();
		 * qualificationMap.put("bca", "BCA"); qualificationMap.put("mca",
		 * "MCA"); qualificationMap.put("btek", "BTEK");
		 * qualificationMap.put("bsc", "SSC");
		 * 
		 * modelMap.addAttribute("qualifications", qualificationMap);
		 */

		System.out.println("Enroll get");
		modelMap.addAttribute("studentcommand", new StudentEnrollCommand());
		return "enroll";
	}

	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public String enroll(@ModelAttribute(name = "studentcommand") @Valid StudentEnrollCommand studentEnrollCommand,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "enroll";
		}
		studentService.enrollStudentDetails(studentEnrollCommand);
		return "enrollsuccess";
	}

}
