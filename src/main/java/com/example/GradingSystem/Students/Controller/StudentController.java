package com.example.GradingSystem.Students.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
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
@GetMapping("/reviewanswer/{id}")
public Optional<StudentAnswerDomian> ReviewAnswer(@PathVariable Integer id) {
		StudentAnswerDomian studentanswer ;
		
		//once we auto-wired we can use this injection to add interface functions 
			return studentservicerepo.ReviewAnswer(id);
		// here also we can add data base code to the get all users data
//				return "All users";
				
			}
	
//this is update quarry
//@GetMapping("/find/{id}") this @getMapping we can identify the end of the URL should 
//be find and here can be able pass id though the link
//@PathVariable Integer id can be identify the variable data which is pass from the id

/*@GetMapping("/find/{id}")
public UserDTO getUserById(@PathVariable (value ="id")long id) {
	
	return serviceuser.findById(id);
	
}
*/
}
