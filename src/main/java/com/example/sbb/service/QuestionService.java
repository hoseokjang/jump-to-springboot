package com.example.sbb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sbb.dto.Question;
import com.example.sbb.repository.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	private final QuestionRepository questionRepository;
	
	public List<Question> getList() {
		return this.questionRepository.findAll();
	}
	
}
