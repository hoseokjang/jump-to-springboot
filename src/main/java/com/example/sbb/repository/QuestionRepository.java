package com.example.sbb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbb.dto.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
