package com.example.GradingSystem.Teachers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;
import com.example.GradingSystem.Teachers.repository.TeacherServiceRepo;

@RestController
@RequestMapping("/module")
@ControllerAdvice
public class TeacherController {
	@Autowired
	private TeacherServiceRepo teacherservicerepo;
	
	@GetMapping("/all")	
	public List<TeacherDomain> alluser() {
	
//once we auto-wired we can use this injection to add interface functions 
	return teacherservicerepo.AllModules();

	}

//here i have change this @RequestBody TeacherDomain User-data
@PostMapping("/add")
public String addUser(@RequestBody TeacherDomain addmodule) {
	
	return teacherservicerepo.SaveModules(addmodule);	
	
}

}
