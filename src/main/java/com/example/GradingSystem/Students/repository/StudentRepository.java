package com.example.GradingSystem.Students.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GradingSystem.Students.domian.StudentDomain;


public interface StudentRepository extends JpaRepository<StudentDomain,Integer>{

}
