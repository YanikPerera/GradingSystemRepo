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
@Table (name = "module")
public class TeacherDomain {
			
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			
			@Column(name = "module_id")
			private Integer id;
			
			@Column(name = "module_name")
			private String ModuleName;
			
			@Column(name = "quizone")
			private String QuizOne;
			
			@Column(name = "quiztwo")
			private Integer QuizTwo;
			
			@Column(name = "quizthree")
			private String QuizThree;
			
			@Column(name = "quizfour")
			private String QuizFour;
			
			@Column(name = "ansone")
			private String AnsOne;
			
			@Column(name = "anstwo")
			private String AnsTwo;
			
			@Column(name = "ansthree")
			private String AnsThree;
			
			@Column(name = "ansfour")
			private String AnsFour;

//getter and setter we are basically use for access the data,bcz in java we don't direct call the programmer values


			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getModuleName() {
				return ModuleName;
			}

			public void setModuleName(String moduleName) {
				ModuleName = moduleName;
			}

			public String getQuizOne() {
				return QuizOne;
			}

			public void setQuizOne(String quizOne) {
				QuizOne = quizOne;
			}

			public Integer getQuizTwo() {
				return QuizTwo;
			}

			public void setQuizTwo(Integer quizTwo) {
				QuizTwo = quizTwo;
			}

			public String getQuizThree() {
				return QuizThree;
			}

			public void setQuizThree(String quizThree) {
				QuizThree = quizThree;
			}

			public String getQuizFour() {
				return QuizFour;
			}

			public void setQuizFour(String quizFour) {
				QuizFour = quizFour;
			}

			public String getAnsOne() {
				return AnsOne;
			}

			public void setAnsOne(String ansOne) {
				AnsOne = ansOne;
			}

			public String getAnsTwo() {
				return AnsTwo;
			}

			public void setAnsTwo(String ansTwo) {
				AnsTwo = ansTwo;
			}

			public String getAnsThree() {
				return AnsThree;
			}

			public void setAnsThree(String ansThree) {
				AnsThree = ansThree;
			}

			public String getAnsFour() {
				return AnsFour;
			}

			public void setAnsFour(String ansFour) {
				AnsFour = ansFour;
			}
			
			
			


		}

