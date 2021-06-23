package com.example.GradingSystem.Students.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;


public interface StudentRepository extends JpaRepository<StudentAnswerDomian,Integer>{



}
