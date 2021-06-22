package com.example.GradingSystem.Teachers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "assignment")
public class AssignmentsDomain {
	
	@Id
	@Column(name = "assignment_id")
	private Integer Assignmentid;
	
	@Column(name = "assignment_name")
	private String AssignmentName;

	public Integer getAssignmentid() {
		return Assignmentid;
	}

	public void setAssignmentid(Integer assignmentid) {
		Assignmentid = assignmentid;
	}

	public String getAssignmentName() {
		return AssignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		AssignmentName = assignmentName;
	}
	
	

}
