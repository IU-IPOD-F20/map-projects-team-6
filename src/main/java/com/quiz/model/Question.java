package com.quiz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long question_id;

    private String question;

    private Boolean answer;

    private Integer position;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "quiz_id", nullable = false)
    @JsonIgnore
    private Quiz quiz;

    public Long getQuestion_id() {
        return question_id;
    }

    public String getQuestion() {
        return question;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public Integer getPosition() {
        return position;
    }

    public Quiz getQuiz() {
        return quiz;
    }
}
