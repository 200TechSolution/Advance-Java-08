package com.tech.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.daoi.DaoI;
import com.tech.model.Student;
import com.tech.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	DaoI di;
	
	@Override
	public int saverecord(Student stu) {
		
		return di.saveRecord(stu);
	}

	@Override
	public List<Student> getSingleData(String us, String pw) {
		
		return di.getSingleData(us, pw);
	}

	@Override
	public List<Student> getAllData(String us, String pw) {
		
		return di.getAllData(us, pw);
	}

	@Override
	public void deleteData(int sid) {
		
		di.deleteData(sid);
		
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return di.getAllStudents();
	}

	@Override
	public Student editData(int sid) {
		
		return di.editData(sid);
	}

	@Override
	public int updateData(Student stu) {
		
		
		
		return di.updateData(stu);
	}

}
