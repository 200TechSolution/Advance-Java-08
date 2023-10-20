package com.tech.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Student;
import com.tech.repository.MyRepo;
import com.tech.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired

	MyRepo studentRepo;

	@Override
	public String saveStudent(Student stu) {

		studentRepo.save(stu);

		return "Student " + stu.getSid() + " Saved Successfully";
	}

	@Override
	public String saveAllStudents(List<Student> students) {
		studentRepo.saveAll(students);
		return "All Students Records are Saved Successfully";
	}

	@Override
	public Student getStudent(String sid) {
		Optional<Student> student = studentRepo.findBySid(sid);

		if (student.isPresent()) {
			System.out.println("Inside if");
			return student.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepo.findAll();
		
	}

}
