package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GradingSystem.Teachers.domain.QuestionDomain;



public interface QuestionRepository extends JpaRepository <QuestionDomain,Integer>{
	
	List<QuestionDomain> findByAssignmentidAndQuestionno(Integer assignmentid,Integer questionno);

}
