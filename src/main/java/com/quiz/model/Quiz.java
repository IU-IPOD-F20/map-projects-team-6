package com.quiz.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private Long quiz_id;

    private String quizname;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OrderBy("order")
    private Set<Question> questionSet;

    public Long getQuiz_id() {
        return quiz_id;
    }

    public String getQuizname() {
        return quizname;
    }
}
