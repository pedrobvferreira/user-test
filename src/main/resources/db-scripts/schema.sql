DROP TABLE IF EXISTS users; 

CREATE TABLE users (
id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
name VARCHAR(100) NOT NULL
);