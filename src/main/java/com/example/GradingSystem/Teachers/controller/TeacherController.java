package com.example.GradingSystem.Teachers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;
import com.example.GradingSystem.Teachers.repository.TeacherServiceRepo;

@RestController
@RequestMapping("/assignment")
@ControllerAdvice
public class TeacherController {
	@Autowired
	private TeacherServiceRepo teacherservicerepo;
	
@GetMapping("/allassignment")	
public List<AssignmentsDomain> AllAssignments() {
	
//once we auto-wired we can use this injection to add interface functions 
	return teacherservicerepo.AllAssignments();

	}

//here i have change this @RequestBody AssignmentsDomain User-data
@PostMapping("/addassignment")
public String addUser(@RequestBody AssignmentsDomain addAssignment) {
	
	return teacherservicerepo.SaveAssignment(addAssignment);	
	
}

@GetMapping("/seequez")	
public List<QuestionDomain> Questionfunc() {
	
//once we auto-wired we can use this injection to add interface functions 
	return teacherservicerepo. Questionfunc();

	}

@PostMapping("/addquestion")
public String addQuestion(@RequestBody QuestionDomain addQuecstion) {
	
	return teacherservicerepo.SaveQuesction(addQuecstion);	
	
}

@GetMapping("/studentgrade")	
public List<QuestionDomain> StudentGrade() {
	
//once we auto-wired we can use this injection to add interface functions 
	return teacherservicerepo.StudentGrade();

	}

@GetMapping("/staticanswer")	
public List<QuestionDomain> StaticAnswer() {
	
//once we auto-wired we can use this injection to add interface functions 
	return teacherservicerepo.StaticAnswer();

	}

}
