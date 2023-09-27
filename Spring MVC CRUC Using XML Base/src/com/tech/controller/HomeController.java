package com.tech.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tech.model.Student;
import com.tech.servicei.ServiceI;

@Controller
public class HomeController {

	@Autowired
	ServiceI si;

	@RequestMapping("/reg")
	public String saveStudent(@ModelAttribute Student stu) {

		System.out.println(stu.getSid());
		System.out.println(stu.getsName());
		int id = si.saverecord(stu);

		if (id > 0) {
			return "index";
		} else {
			return "register";
		}

	}

	@RequestMapping("/log")
	public String getData(@RequestParam("user") String us, @RequestParam("pass") String pw, Model m) {

		System.out.println("Inside Login check");
		if (us.equals("admin") && pw.equals("123")) {
			System.out.println("inside admin login");
			List<Student> studentsList = si.getAllData(us, pw);
			m.addAttribute("data", studentsList);
			Iterator<Student> itr = studentsList.iterator();
			while (itr.hasNext()) {
				Student stu = itr.next();
				System.out.println(stu.getSid());
				System.out.println(stu.getsName());
				System.out.println(stu.getAddrs());
				System.out.println(stu.getUser());
				System.out.println(stu.getPass());
				System.out.println("*-********");
			}
			return "success";

		}

		else if (us.equals(us) && pw.equals(pw)) {

			List<Student> singleData = si.getSingleData(us, pw);
			m.addAttribute("data", singleData);

			Iterator<Student> itr = singleData.iterator();
			while (itr.hasNext()) {
				Student stu = itr.next();
				System.out.println(stu.getSid());
				System.out.println(stu.getsName());
				System.out.println(stu.getAddrs());
				System.out.println(stu.getUser());
				System.out.println(stu.getPass());
			}
			return "success";

		}

		return "index";

	}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("radio") int sid, Model m)
	{
		
		si.deleteData(sid);
		 List<Student> allStudents = si.getAllStudents();
		 m.addAttribute("data", allStudents);
		return "success";
		
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("radio")int sid,Model m)
	{
		  Student stu = si.editData(sid);
		  m.addAttribute("data",stu);
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{
		int sid = si.updateData(s);
		 List<Student> allStudents = si.getAllStudents();
		
		if(sid!=0)
		{
			m.addAttribute("data",allStudents );
			
			return "success";
		}
		return "index";
			
	}

}
