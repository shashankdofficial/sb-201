package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //When we use this then we don't need to use @ResponseBody
@RequestMapping("/studentapp") //Class Uri
public class MyController {

//	@RequestMapping("/hello")
//	public String sayHello() {
//		return "Welcome"; //Logical name of physical jsp page i.e welcome.jsp
//	}

	
	@RequestMapping("/hello")
	//@ResponseBody //It is for so it will send the data as RAW Data
	public String sayHello() {
		return "Welcome"; //Representing raw data
	}
	
	//@RequestMapping("/student") //Return JSON Data
	//Or
	//Get is defaut type that's why we use first approach
//	@RequestMapping(value="/student", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
//	public Student getStudentHandler() {
//		Student student = new Student(10,"Ram",780);
//		
//		return student;
//	}
	
//	@GetMapping("/student") //Shortcut of combile GET method and Request Mapping
//	public Student getStudentHandler() {
//		Student student = new Student(10,"Ram",780);
//		
//		return student;
//	}
	
//	//path Variable
//	@GetMapping("/student/{roll}") 
//	public Student getStudentHandler(@PathVariable("roll") int rollno) {
//		return new Student(rollno,"Ram",780);
//	}
	
	//Multiple path Variable
	@GetMapping("/student/{roll}/{name}/{marks}") 
	public Student getStudentHandler(@PathVariable("roll") int rollno,
									@PathVariable("name") String name,
									@PathVariable("marks") int marks) {
		return new Student(rollno,name,marks);
	}
	
	//List of Student
//	@RequestMapping("/students") //Return JSON Data
//	public List<Student> getStudentHandler() {
//		
//		List<Student> students = new ArrayList<>();
//		
//		students.add(new Student(10,"Ram",780));
//		students.add(new Student(20,"Shyam",680));
//		students.add(new Student(30,"Ramesh",880));
//		students.add(new Student(40,"Suresh",980));
//		
//		return students;
//	}
}
