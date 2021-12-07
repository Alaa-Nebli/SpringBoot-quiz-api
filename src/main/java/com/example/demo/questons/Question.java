package com.example.demo.questons;


import javax.persistence.*;

@Entity(name = "Question")
@Table(
        name = "Question"
)
public class Question {
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

    private Long quizzId ;
    private String quest ;
    private String opt1 ;
    private String opt2 ;
    private String opt3 ;
    private String correct_opt ;

    public Question(long id, String quest, String opt1, String opt2, String opt3, String correct_opt) {
        this.id = id;
        this.quest = quest;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.correct_opt = correct_opt;
    }

    public Question(String quest, String opt1, String opt2, String opt3, String correct_opt) {
        this.quest = quest;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.correct_opt = correct_opt;
    }

    public Question() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getCorrect_opt() {
        return correct_opt;
    }

    public void setCorrect_opt(String correct_opt) {
        this.correct_opt = correct_opt;
    }
}
