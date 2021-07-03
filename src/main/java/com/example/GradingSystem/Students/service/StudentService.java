package com.example.GradingSystem.Students.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Students.repository.StudentCrudRepository;
import com.example.GradingSystem.Students.repository.StudentRepository;
import com.example.GradingSystem.Students.repository.StudentServiceRepo;
import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.repository.QuestionRepository;
import com.example.GradingSystem.Teachers.repository.TeacherRepository;

import ExceptionHandling.NotFoundException;

@Service
public class StudentService implements StudentServiceRepo{

	@Autowired
	private StudentRepository studentrepository;
	
	//@Autowired
	//private StudentCrudRepository studentcrudrepository;
	
	//@Autowired
	//private TeacherRepository teacherrepository;
	
	@Autowired
	private QuestionRepository quecstionrepository;

	

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



	


	
	/*@Override
	public Optional <StudentAnswerDomian> Getanswer(int studentid, int assignmentid, int questionid) {
		// TODO Auto-generated method stub
		//System.out.println(studentid+assignmentid+questionid);
		//return studentrepository.(studentid,assignmentid,questionid);
		//StudentAnswerDomian student;
		
		//if(studentid = ) {
			
			
			return null;
		//}
		
		//return studentrepository.findFirstByStudentidANDAnsweridANDAssignmentid(studentid, assignmentid, questionid);
		//return null;
	}*/


	@Override
	public List<StudentAnswerDomian> Getanswers(Integer studentid, Integer assignmentid, Integer questionid) {
		
		List<StudentAnswerDomian> allanswer = studentrepository.findByStudentidAndAssignmentidAndQuestionid(studentid,assignmentid,questionid);
		
	//	List<AssignmentsDomain> allassgn = teacherrepository.findByAssignmentidAndQuestionno(assignmentid, questionid);
		
		
		// TODO Auto-generated method stub
		//return null;
		return allanswer;
	}




	/*@Override
	public List<StudentAnswerDomian> Getanswers(Integer studentid) {
		
		List<StudentAnswerDomian> allanswer = studentrepository.findBystudentid(studentid);
		
		return allanswer;
		// TODO Auto-generated method stub
		//return null;
	}*/







	@Override
	public List<QuestionDomain> GetQuecstionAns(Integer assignmentid, Integer questionno) {
		
		List<QuestionDomain> questionforans = quecstionrepository.findByAssignmentidAndQuestionno(assignmentid,questionno);
		// TODO Auto-generated method stub
		return questionforans;
	}







	@Override
	public List<StudentAnswerDomian> StudentResult() {
		// TODO Auto-generated method stub
		return null;
	}







	
	
	
	
	
	

}
