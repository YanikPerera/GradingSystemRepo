package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;

public interface TeacherServiceRepo {


	String SaveAssignment(AssignmentsDomain addAssignment);

	List<AssignmentsDomain> AllAssignments();

	List<QuestionDomain> Questionfunc();

	String SaveQuesction(QuestionDomain addQuecstion);

	List<QuestionDomain> StudentGrade();

	List<QuestionDomain> StaticAnswer();


}
