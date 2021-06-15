package com.example.GradingSystem.Teachers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GradingSystem.Teachers.domain.TeacherDomain;


public interface TeacherRepository extends JpaRepository<TeacherDomain,Integer> {
	
	// we can proceed here our crud operations 
	//getALLusers
	//find-by-id
	//delete
	//update
	//custom query

}
