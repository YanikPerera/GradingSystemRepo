package com.example.GradingSystem.Students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Students.domian.StudentDomain;
import com.example.GradingSystem.Students.repository.StudentRepository;
import com.example.GradingSystem.Students.repository.StudentServiceRepo;

@Service
public class StudentService implements StudentServiceRepo{

	@Autowired
	private StudentRepository studentrepository;

	@Override
	public List<StudentAnswerDomian> ReviewAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentAnswerDomian> StudentResult() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
