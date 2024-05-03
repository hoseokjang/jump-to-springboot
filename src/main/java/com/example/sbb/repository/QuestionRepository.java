package com.example.sbb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbb.dto.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
	
}
