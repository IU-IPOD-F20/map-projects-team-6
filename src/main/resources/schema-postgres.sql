DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS cities;
CREATE TABLE users(user_id serial PRIMARY KEY, userName VARCHAR(255), password VARCHAR(255), role VARCHAR(255), enabled INTEGER);