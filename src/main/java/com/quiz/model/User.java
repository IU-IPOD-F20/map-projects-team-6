package com.quiz.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    private String username;

    private String password;

    private String role;

    private Integer enabled;

    public User(String newUsername, String newPassword, String newRole, Integer newEnabled) {
        this.username = newUsername;
        this.password = newPassword;
        this.role = newRole;
        this.enabled = newEnabled;
    }

    public User() {
        this.username = null;
        this.enabled = null;
        this.password = null;
        this.role = null;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Integer getEnabled() {
        return enabled;
    }
}
