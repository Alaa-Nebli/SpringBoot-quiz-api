package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "student")
@Table(
        name = "student",
        uniqueConstraints = {
            @UniqueConstraint(name = "email_unique_constraint", columnNames = "email")
        }
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "Student_Seq",
            sequenceName = "Student_seq",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Student_seq"
    )

    @Column(
            name = "_id",
            nullable = false
    )
    private Long _id ;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private  String name ;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private  String email ;
    
    @Column(
            name = "age",
            nullable = false
    )
    private int age ;
    
    @Column(
            name= "password",
            nullable = false,
            columnDefinition= "Text"
    )
    private  String password ; 
    
    
    public Student(Long _id, String name, String email,String password, int age) {
        this._id = _id;
        this.name = name;
        this.email = email;
        this.password = password ;
        this.age = age;
        
    }

    public Student(String name, String email, LocalDate date, int age) {
        this.name = name;
        this.email = email;
        
        this.age = age;
    }

    public Student() {
        name="user" ;
        email="user@user.com" ;
        age= 23 ;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
