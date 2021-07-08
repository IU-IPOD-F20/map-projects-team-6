INSERT INTO users(username, password, role, enabled) VALUES('admin', '$2a$10$zxvEq8XzYEYtNjbkRsJEbukHeRx3XS6MDXHMu8cNuNsRfZJWwswDy', 'ROLE_ADMIN', 1);
INSERT INTO quizzes(quizname) VALUES ('quiz1');
INSERT INTO quizzes(quizname) VALUES ('quiz2');
INSERT INTO questions(question, answer, position, quiz_id) VALUES ('question1', true, 0, 1);
INSERT INTO questions(question, answer, position, quiz_id) VALUES ('question2', false, 1, 1);
INSERT INTO questions(question, answer, position, quiz_id) VALUES ('question1', false, 0, 2);