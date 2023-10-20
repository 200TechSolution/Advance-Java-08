package com.tech.servicei;

import java.util.List;

import com.tech.entity.Student;

public interface ServiceI {
	
	public String saveStudent(Student stu);
	
	public String saveAllStudents(List<Student> students);
	
	public Student getStudent(String sid);
	
	
	public List<Student> getAllStudents();

}
