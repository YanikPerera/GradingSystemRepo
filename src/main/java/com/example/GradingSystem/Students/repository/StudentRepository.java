package com.example.GradingSystem.Students.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;


public interface StudentRepository extends JpaRepository<StudentAnswerDomian,Integer>{
	
	List<StudentAnswerDomian> findByStudentidAndAssignmentidAndQuestionid(Integer studentid,Integer assignmentid,Integer questionid);
	
	//@Query("SELECT * FROM student_answer WHERE student_id = studentid AND assignment_id = assignmentid AND question_id = questionid")
	//Optional <StudentAnswerDomian> FindByResult(int studentid, int assignmentid, int questionid);

	//@Query("SELECT student_answer.answer FROM student_answer JOIN question ON student_answer.student_id = 1 AND student_answer.assignment_id = question.assignment_id AND student_answer.answer = question.answer AND student_answer.question_id = question.question_no");
    //List<StudentAnswerDomian> findByStudentidAndAssignmentidAndQuestionid()


}

