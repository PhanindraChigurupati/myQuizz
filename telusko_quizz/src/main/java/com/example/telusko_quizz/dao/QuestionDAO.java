    package com.example.telusko_quizz.dao;

    import com.example.telusko_quizz.entity.Question;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.List;

    @Repository
    public interface QuestionDAO extends JpaRepository<Question, Integer> {
        List<Question> findByCategory(String category);
    }
