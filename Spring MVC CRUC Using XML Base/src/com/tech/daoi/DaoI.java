package com.tech.daoi;

import java.util.List;

import com.tech.model.Student;

public interface DaoI {

	
	public int saveRecord(Student stu);
	
	public List<Student>getSingleData(String us,String pw);
	
	public List<Student>getAllData(String us,String pw);
	
	public void deleteData(int sid);
	
	public List<Student>getAllStudents();
	
	public Student editData(int sid);
	
	public int updateData(Student s);
}
