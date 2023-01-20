package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

@RestController
public class StudentController {

//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Welcome";
//	}
	
	//Response Entity
	//===============
	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		
		HttpHeaders hh = new HttpHeaders();
		hh.add("jkj", "bhjdbdsbfd");
		hh.add("user", "admin");
		hh.add("hello", "abc");
		
		return new ResponseEntity<>("Welcome!",hh, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/students/{roll}")
	public Student getStudentDetailsHandler(@PathVariable("roll") Integer roll) {
		
		Student student = new Student(roll, "Ram", 780);
		return student;
	}
	
//	@GetMapping("/getStudent")
//	public Student getStudentDetailsHandler2(@RequestParam("r") Integer roll) {
//		
//		Student student = new Student(roll, "Ram", 780);
//		return student;
//	}
	
	//And if the key name is same then we don't need to take extra key
	@GetMapping("/getStudent")
	public Student getStudentDetailsHandler2(@RequestParam Integer r,
											@RequestParam String n,
											@RequestParam Integer m
											) {
		
		Student student = new Student(r, n, m);
		return student;
	}
	
	//Initially @RequestParam is required but we can make it not required so it will not throw exception
//	@GetMapping("/getStudent")
//	public Student getStudentDetailsHandler2(@RequestParam(value = "r", required = false) Integer r) {
//		
//		Student student = new Student(r, "Ram", 780);
//		return student;
//	}
	
	@GetMapping("/students")
	public List<Student> getStudentHandler() {
		
		return Arrays.asList(
				
				new Student(10, "Shashank", 880),
				new Student(20, "Pankaj", 780),
				new Student(30, "Niharika", 680),
				new Student(40, "manoj", 580)
				
				);
	}
	
	
	//Now the Post Request
	//=====================
	
	@PostMapping(value = "/students", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveStudenthandler(@RequestBody Student student) {
		
		return "Student stored, "+student;
		
	}
	
	
	//Now PUT Mapping
	//===============
	
	@PutMapping(value = "/students/{roll}")
	public Student updateStudentDetails(@RequestBody Student student,@PathVariable("roll")int roll) {
		
		//We need to first find the student with the roll
		//and then update that student with the students details coming from request body
		student.setMarks(student.getMarks()+500);
		
		return student;
	}
}
