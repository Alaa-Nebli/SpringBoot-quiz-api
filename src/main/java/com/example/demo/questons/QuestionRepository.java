package com.example.demo.questons;


import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    @Query("SELECT s from Question s where  s.quizzId = ?1")
    List<Question> GetQuestByQuiz(Long id);

}
