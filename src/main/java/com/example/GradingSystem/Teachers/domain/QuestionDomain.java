package com.example.GradingSystem.Teachers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "question")
public class QuestionDomain {


	@Id
	@Column(name = "question_id")
	private Integer Questionid;
	
	@Column(name = "question_no")
	private String Questionno;
	
	@Column(name = "question")
	private String Question;
	
	@Column(name = "answer")
	private Integer Answer;
	
	@Column(name = "assignment_id")
	private Integer Assignmentid;

	public Integer getQuestionid() {
		return Questionid;
	}

	public String getQuestionno() {
		return Questionno;
	}

	public void setQuestionno(String questionno) {
		Questionno = questionno;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public Integer getAnswer() {
		return Answer;
	}

	public void setAnswer(Integer answer) {
		Answer = answer;
	}

	public Integer getAssignmentid() {
		return Assignmentid;
	}

	public void setAssignmentid(Integer assignmentid) {
		Assignmentid = assignmentid;
	}

	public void setQuestionid(Integer questionid) {
		Questionid = questionid;
	}

	

	
}
