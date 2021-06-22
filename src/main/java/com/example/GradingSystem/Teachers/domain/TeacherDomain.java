package com.example.GradingSystem.Teachers.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//as below the code we can create a entity with the database values
// first we should have mention the table name,, the table name is not in the database it will create automatically 
@Entity
@Table (name = "teacher")
public class TeacherDomain {
			
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)	
			@Column(name = "teacher_id")
			private Integer Teacherid;
			
			@Column(name = "teacher_name")
			private String Teachername;

			public Integer getTeacherid() {
				return Teacherid;
			}

			public void setTeacherid(Integer teacherid) {
				Teacherid = teacherid;
			}

			public String getTeachername() {
				return Teachername;
			}

			public void setTeachername(String teachername) {
				Teachername = teachername;
			}
			
//getter and setter we are basically use for access the data,bcz in java we don't direct call the programmer values

			
			
			


		}

