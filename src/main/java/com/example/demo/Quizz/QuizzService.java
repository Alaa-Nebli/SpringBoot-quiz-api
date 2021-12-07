package com.example.demo.Quizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuizzService {
    private final QuizzRepository quizzRepository;

    @Autowired
    public QuizzService(QuizzRepository quizzRepository) {
        this.quizzRepository = quizzRepository;
    }

    public List<Quizz> getQuizz()  {
        return quizzRepository.findAll() ;
    }

    public Quizz getQuizzById(long id) {
        return quizzRepository.getById(id) ;
    }

    public void postQuizz(Quizz quizz){
        quizzRepository.save(quizz) ;
    }

    public void deleteQuizz(long id){
        quizzRepository.deleteById(id);
    }
}
