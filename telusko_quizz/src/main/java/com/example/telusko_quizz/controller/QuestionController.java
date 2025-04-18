package com.example.telusko_quizz.controller;


import com.example.telusko_quizz.entity.Question;
import com.example.telusko_quizz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {

    QuestionService questionService;

    @Autowired
    QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }


    @GetMapping("/category/{category}")
    public List<Question> getByCategory(@PathVariable String category) {
        System.out.println("Fetching questions for category: " + category);
        return questionService.getByCategory(category);
    }
    @GetMapping("/id/{id}")
    public Question getByID(@PathVariable int id){
        return questionService.getById(id);
    }
    
}
