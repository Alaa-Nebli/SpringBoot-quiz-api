package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent()  {
        return studentRepository.findAll() ;
    }

    public void postStudent(Student student){
      studentRepository.save(student) ;
    }

    public void deleteStudent(long id){
//        studentRepository
    }
}
