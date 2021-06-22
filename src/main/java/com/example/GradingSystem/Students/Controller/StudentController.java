package com.example.GradingSystem.Students.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Students.domian.StudentDomain;
import com.example.GradingSystem.Students.repository.StudentServiceRepo;


@RestController
@RequestMapping("/student")
@ControllerAdvice	
public class StudentController {
	
	@Autowired
	private StudentServiceRepo studentservicerepo;
	
@GetMapping("/result")
public List<StudentAnswerDomian> StudentResultChecker() {
		
		//once we auto-wired we can use this injection to add interface functions 
			return studentservicerepo.StudentResult();
		// here also we can add data base code to the get all users data
//				return "All users";
				
			}
@GetMapping("/reviewanswer")
public List<StudentAnswerDomian> ReviewAnswer() {
		
		//once we auto-wired we can use this injection to add interface functions 
			return studentservicerepo.ReviewAnswer();
		// here also we can add data base code to the get all users data
//				return "All users";
				
			}
	
}
