package com.example.demo.Quizz;

import com.example.demo.student.Student;
import com.example.demo.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/Quizz")
public class QuizzController {

    @Autowired
    private QuizzService quizzService  ;

    public QuizzController() {

    }

    public QuizzController(QuizzService quizzService) {
        this.quizzService = quizzService;
    }

    @GetMapping
    public List<Quizz> getQuizz(){
        return quizzService.getQuizz() ;
    }

    @GetMapping(path = "{QuizzId}")
    public Quizz getQuizzById(@PathVariable("QuizzId") Long id){
        return quizzService.getQuizzById(id) ;
    }

    @PostMapping
    public void postStudent(@RequestBody Quizz quizz){
        quizzService.postQuizz(quizz); ;
    }


    @DeleteMapping(path = "{quizzId}")
    public void deleteStudent(@PathVariable("quizzId") Long id){
        quizzService.deleteQuizz(id);
            }



}
