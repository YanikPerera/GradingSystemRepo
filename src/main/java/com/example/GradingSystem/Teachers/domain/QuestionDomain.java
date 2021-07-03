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
	private Integer questionno;
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "answer")
	private Integer answer;
	
	@Column(name = "assignment_id")
	private Integer assignmentid;

	public Integer getQuestionid() {
		return Questionid;
	}

	public void setQuestionid(Integer questionid) {
		Questionid = questionid;
	}

	public Integer getQuestionno() {
		return questionno;
	}

	public void setQuestionno(Integer questionno) {
		this.questionno = questionno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

	public Integer getAssignmentid() {
		return assignmentid;
	}

	public void setAssignmentid(Integer assignmentid) {
		this.assignmentid = assignmentid;
	}

	

	

	
}
