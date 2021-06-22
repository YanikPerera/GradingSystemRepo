package com.example.GradingSystem.Students.repository;

import java.util.List;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;


public interface StudentServiceRepo {

	List<StudentAnswerDomian> StudentResult();

	List<StudentAnswerDomian> ReviewAnswer();



}
