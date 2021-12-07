package com.example.demo.Quizz;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Quizz")
@Table(
        name = "Quizz"
)
public class Quizz {

    @Id
    @SequenceGenerator(
            name = "Quizz_Seq",
            sequenceName = "Quizz_seq",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Quizz_seq"
    )

    private long id ;

    private String name ;
    private String field ;
    public Quizz(long id, String name, String field) {
        this.id = id;
        this.name = name;
        this.field = field;
    }

    public Quizz(String name, String field) {
        this.name = name;
        this.field = field;
    }

    public Quizz() {
    }

    public long get_id() {
        return id;
    }

    public void set_id(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


}
