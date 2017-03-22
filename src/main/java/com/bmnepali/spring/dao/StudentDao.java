package com.bmnepali.spring.dao;

import java.util.List;

import com.bmnepali.spring.model.Student;

public interface StudentDao {

	Student findById(int id);

	void saveStudent(Student student);
	
	public void saveOrUpdate(Student student);
	
	void deleteStudentByCode(String ssn);
	
	List<Student> findAllStudents();

	Student findStudentByCode(String ssn);

}
