package com.tech.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.Student;


@Repository
public interface MyRepo extends CrudRepository<Student,Integer>{
	
	
public  List<Student>	findByFirstName(String firstName);

public  List<Student>	findByFirstNameAndLastName(String firstName, String lastname);

public  List<Student>	findByFirstNameOrLastName(String firstName, String lastname);

public Optional<Student>    findBySid(String sid);
	


} 
