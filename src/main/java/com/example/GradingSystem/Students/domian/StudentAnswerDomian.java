package com.example.GradingSystem.Students.domian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table (name = "student_answer")
public class StudentAnswerDomian {
	
	@Id
	@NotNull
	@Column(name = "answer_id")
	private Integer Answerid;
	@NotNull
	@Column(name = "answer")
	private Integer Answer;
	@NotNull
	@Column(name = "assignment_id")
	private Integer assignmentid;
	@NotNull
	@Column(name = "student_id")
	private Integer studentid;
	@NotNull
	@Column(name = "question_id")
	private Integer questionid;
	public Integer getAnswerid() {
		return Answerid;
	}
	public void setAnswerid(Integer answerid) {
		Answerid = answerid;
	}
	public Integer getAnswer() {
		return Answer;
	}
	public void setAnswer(Integer answer) {
		Answer = answer;
	}
	public Integer getAssignmentid() {
		return assignmentid;
	}
	public void setAssignmentid(Integer assignmentid) {
		this.assignmentid = assignmentid;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getQuestionid() {
		return questionid;
	}
	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}
	
	
	
	
	

}
