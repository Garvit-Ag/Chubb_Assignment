package com.MongoSpring.MongoSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MongoSpring.MongoSpring.Model.Student;
import com.MongoSpring.MongoSpring.Repository.StudentRepo;

@RestController
public class MainController {
	
@Autowired
StudentRepo studentRepo;
	
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
	    studentRepo.save(student);
	}
	
	@GetMapping("/fetchStudents")
	public List<Student> fetchStudents() {
		return studentRepo.findAll();
	}
}
