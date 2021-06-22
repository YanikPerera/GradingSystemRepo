package com.example.GradingSystem.Students.domian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;

//as below the code we can create a entity with the database values
// first we should have mention the table name,, the table name is not in the database it will create automatically 
@Entity
@Table (name = "student")
public class StudentDomain {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@NotNull
		@Column(name = "student_id")
		private Integer Studentid;
		@NotNull
		@Column(name = "student_name")
		private String StudentName;
		public Integer getStudentid() {
			return Studentid;
		}
		public void setStudentid(Integer studentid) {
			Studentid = studentid;
		}
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		
		
//getter and setter we are basically use for access the data,bcz in java we don't direct call the programmer values
		
		
		
	}

	

