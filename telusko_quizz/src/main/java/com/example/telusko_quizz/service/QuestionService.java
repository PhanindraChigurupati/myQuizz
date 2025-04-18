package com.example.telusko_quizz.service;

import com.example.telusko_quizz.dao.QuestionDAO;

import com.example.telusko_quizz.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionDAO questionDAO;

    @Autowired
    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    // Method to get all questions
    public List<Question> getAllQuestions() {
        return questionDAO.findAll();
    }

    // Method to get questions by category
    public List<Question> getByCategory(String category) {
        return questionDAO.findByCategory(category);
    }

    // Method to get a question by ID
    public Question getById(int id) {
        return questionDAO.findById(id).orElseThrow(() -> new RuntimeException("Question not found with id: " + id));
    }
}