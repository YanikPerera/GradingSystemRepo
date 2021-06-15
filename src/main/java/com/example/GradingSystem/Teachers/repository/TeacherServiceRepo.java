package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import com.example.GradingSystem.Teachers.domain.TeacherDomain;

public interface TeacherServiceRepo {

	List<TeacherDomain> AllModules();

	String SaveModules(TeacherDomain addmodule);
	
	

}
