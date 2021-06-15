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
@Table (name = "studentmarks")
public class StudentDomain {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@NotNull
		@Column(name = "student_id")
		private Integer stid;
		@NotNull
		@Column(name = "student_name")
		private String StudentName;
		@NotNull
		@Column(name = "stmodule_id")
		private String StModuleid;
		@NotNull
		@Column(name = "stmodule_name")
		private String StModuleName;
		@NotNull
		@Column(name = "stansone")
		private String StAnwOne ;
		@NotNull
		@Column(name = "stanstwo")
		private String StAnwTwo;
		@NotNull
		@Column(name = "stansthree")
		private String StAnwThree;
		@NotNull
		@Column(name = "stansfour")
		private String StAnwFour;
		
//getter and setter we are basically use for access the data,bcz in java we don't direct call the programmer values
		
		public Integer getStid() {
			return stid;
		}
		public void setStid(Integer stid) {
			this.stid = stid;
		}
		public String getStudentName() {
			return StudentName;
		}
		public void setStudentName(String studentName) {
			StudentName = studentName;
		}
		public String getStModuleid() {
			return StModuleid;
		}
		public void setStModuleid(String stModuleid) {
			StModuleid = stModuleid;
		}
		public String getStModuleName() {
			return StModuleName;
		}
		public void setStModuleName(String stModuleName) {
			StModuleName = stModuleName;
		}
		public String getStAnwOne() {
			return StAnwOne;
		}
		public void setStAnwOne(String stAnwOne) {
			StAnwOne = stAnwOne;
		}
		public String getStAnwTwo() {
			return StAnwTwo;
		}
		public void setStAnwTwo(String stAnwTwo) {
			StAnwTwo = stAnwTwo;
		}
		public String getStAnwThree() {
			return StAnwThree;
		}
		public void setStAnwThree(String stAnwThree) {
			StAnwThree = stAnwThree;
		}
		public String getStAnwFour() {
			return StAnwFour;
		}
		public void setStAnwFour(String stAnwFour) {
			StAnwFour = stAnwFour;
		}
			
		
	}

	

