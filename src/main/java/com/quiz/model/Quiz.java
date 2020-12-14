package com.quiz.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "quizes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private Long quiz_id;

    private String quizName;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OrderBy("order")
    private Set<Question> questionSet;
}
