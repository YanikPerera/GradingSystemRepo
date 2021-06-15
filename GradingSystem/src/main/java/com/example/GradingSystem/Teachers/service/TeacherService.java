package com.example.GradingSystem.Teachers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;
import com.example.GradingSystem.Teachers.repository.TeacherRepository;
import com.example.GradingSystem.Teachers.repository.TeacherServiceRepo;

@Service
public class TeacherService implements TeacherServiceRepo {
	
	@Autowired
	private TeacherRepository teacherrepository;

	
	@Override
	public List<TeacherDomain> AllModules() {
		
// here we can get users as a list by using List<TeacherDomain>
	List<TeacherDomain> allmodules = teacherrepository.findAll();
	
	return allmodules;
	}


	@Override
	public String SaveModules(TeacherDomain addmodule) {
		// TODO Auto-generated method stub
		return null;
	}
}
