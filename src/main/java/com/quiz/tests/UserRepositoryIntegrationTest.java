package com.quiz.tests;

import com.quiz.model.User;
import com.quiz.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {

        User alex = new User("admin", "admin", "admin", 1);
        entityManager.persistAndFlush(alex);


        User found = userRepository.findById(alex.getUser_id()).orElse(new User());

        assertThat(found.getUsername()).isNotNull();
    }
}
