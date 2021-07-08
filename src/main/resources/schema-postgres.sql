DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS quizzes;
CREATE TABLE users(user_id serial PRIMARY KEY, username VARCHAR(255), password VARCHAR(255), role VARCHAR(255), enabled INTEGER);
CREATE TABLE quizzes(quiz_id serial PRIMARY KEY, quizname VARCHAR(255));
CREATE TABLE questions(question_id serial PRIMARY KEY, question VARCHAR(2000), answer BOOLEAN, position INTEGER, quiz_id INTEGER);
ALTER TABLE questions ADD CONSTRAINT fk_quiz FOREIGN KEY(quiz_id) REFERENCES quizzes(quiz_id);