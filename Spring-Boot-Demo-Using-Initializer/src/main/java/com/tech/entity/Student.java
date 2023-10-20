package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@Entity
public class Student {
	
	@Id
	private String sid;
	
	private String firstName;
	
	private String addrs;
	
	private String lastName;
	
	private String cityName;
	
	private double age;
	
	

}
