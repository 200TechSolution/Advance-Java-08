package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Student;
import com.tech.servicei.ServiceI;

@RestController
public class HomeController {

	@Autowired

	ServiceI studentService;

	// @RequestMapping(value = "student/add",method = RequestMethod.POST)
	@PostMapping("student/add")
	public ResponseEntity<String> saveStudents(@RequestBody Student stu) {
		String respMessage;

		respMessage = studentService.saveStudent(stu);
		return new ResponseEntity<String>(respMessage, HttpStatus.CREATED);

	}
	
	@PostMapping("students/add")
	public ResponseEntity<String>saveAllStudents(@RequestBody List<Student> students)
	{
		String respMessage;
	respMessage=	studentService.saveAllStudents(students);
	
	return new ResponseEntity<String>(respMessage,HttpStatus.CREATED);
	}
	
	@GetMapping("student/get/{sid}")
	public ResponseEntity<Object>getStudents(@PathVariable String sid)
	{
		
	     Student students = studentService.getStudent(sid);
	     
	     if(students !=null)
	     {
	     return new ResponseEntity<Object>(students,HttpStatus.OK);
	     }
		return new ResponseEntity<Object>("Student "+sid+" Does not Exist",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("students/get")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> allStudents = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
		
	}
	

}
