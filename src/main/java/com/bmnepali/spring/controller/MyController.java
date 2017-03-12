package com.bmnepali.spring.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmnepali.spring.model.Student;
import com.bmnepali.spring.service.StudentService;

@Controller
@RequestMapping("/")
public class MyController {

	@Autowired
	StudentService service;

	@Autowired
	MessageSource messageSource;

	/*
	 * List all existing Students.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listStudents(ModelMap model) {

		List<Student> students = service.findAllStudents();
		model.addAttribute("students", students);
		return "allstudents";
	}
}
