package com.example.GradingSystem.Teachers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GradingSystem.Teachers.domain.QuestionDomain;



public interface QuestionRepository extends JpaRepository <QuestionDomain,Integer>{

}
