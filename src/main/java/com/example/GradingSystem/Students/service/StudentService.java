package com.example.GradingSystem.Students.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Students.repository.StudentCrudRepository;
import com.example.GradingSystem.Students.repository.StudentRepository;
import com.example.GradingSystem.Students.repository.StudentServiceRepo;

import ExceptionHandling.NotFoundException;

@Service
public class StudentService implements StudentServiceRepo{

	@Autowired
	private StudentRepository studentrepository;
	
	@Autowired
	private StudentCrudRepository studentcrudrepository;

	

	@Override
	public Optional <StudentAnswerDomian> ReviewAnswer(Integer id) {
	//	StudentAnswerDomian studentanswer = null;
		// id= studentanswer.getQuestionid();
		 
		 
		
	if(id ==null) 
	{
			
			throw new NotFoundException("Please Put the User ID"+id );
			
		}else 
			
		{
			
		
		
			return studentrepository.findById(id);
		} 
		// TODO Auto-generated method stub
	}



	@Override
	public List<StudentAnswerDomian> StudentResult() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
