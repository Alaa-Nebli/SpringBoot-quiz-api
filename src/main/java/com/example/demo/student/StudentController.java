package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService ;

    public StudentController() {

    }

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent() ;
    }

    @PostMapping
    public void postStudent(@RequestBody Student student){
        studentService.postStudent(student) ;
    }

}

