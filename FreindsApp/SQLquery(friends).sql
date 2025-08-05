CREATE DATABASE friends_db;

USE friends_db;

CREATE TABLE friends (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15)
);

Select * from friends;