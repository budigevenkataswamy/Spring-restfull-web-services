package com.venkat.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	//define @PostContruct to load the student data..only once!
	@PostConstruct
	public void loadData() {
		theStudents=new ArrayList<>();
		theStudents.add(new Student("venkata","swamy"));
		theStudents.add(new Student("pavan","kumar"));
		theStudents.add(new Student("jurru","parashuram"));
	}
	
	//define end point for /students  -return the list of students
	@RequestMapping("/students")
	public List<Student> getStudents(){
		
		return theStudents;
	}
	
	//define end point for "/students{studentId}" - return student at index
 
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		//just index into the list......keep it simple now
		
		//cheack the student id against the list
		
		if((studentId>=theStudents.size()) ||(studentId<0)) {
			throw new StudentNotFoundException("Student id notfound -"+studentId);
		}
		return theStudents.get(studentId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
