package com.example.GradingSystem.Students.repository;

import java.util.List;
import java.util.Optional;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;


public interface StudentServiceRepo {

	List<StudentAnswerDomian> StudentResult();

	//List<StudentAnswerDomian> ReviewAnswer(Integer id);
	
	Optional <StudentAnswerDomian> ReviewAnswer(Integer id);

	//Optional <StudentAnswerDomian> Getanswer(int studentid, int assignmentid, int questionid);

	List<StudentAnswerDomian> Getanswers(Integer studentid, Integer assignmentid, Integer questionid);

	List<QuestionDomain> GetQuecstionAns(Integer assignmentid, Integer questionno);


}
