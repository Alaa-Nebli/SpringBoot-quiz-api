package com.example.demo.questons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionService {

    private final QuestionRepository questionRepository ;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuizzQuest(long id){
        return questionRepository.GetQuestByQuiz(id) ;
    }

    public Question getQuestionByid(long id){ return questionRepository.getById(id) ; }

    public void updateQuestion(long id,Question question){ questionRepository.}

    public void PostQuestion(Question question){
        questionRepository.save(question) ;
    }


}
