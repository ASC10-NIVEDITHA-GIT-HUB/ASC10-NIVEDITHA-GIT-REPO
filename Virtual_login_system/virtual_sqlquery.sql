-- Create database
CREATE DATABASE VLSDB;
GO

USE VLSDB;
GO


-- Login Table
CREATE TABLE Login (
    login_id INT IDENTITY(1,1) PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL
);

INSERT INTO Login (username, password) VALUES
('admin', 'admin123'),
('moderator', 'mod123');

-- Course Table
CREATE TABLE Course (
    course_id INT IDENTITY(1,1) PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    author_name VARCHAR(100) NOT NULL,
    duration_hours INT NOT NULL,
    availability BIT NOT NULL
);

INSERT INTO Course (course_name, author_name, duration_hours, availability) VALUES
('Java Basics', 'John Doe', 10, 1),
('Spring Boot Intro', 'Jane Smith', 8, 1),
('SQL Server Essentials', 'Alex White', 6, 1);

INSERT INTO Course (course_name, author_name, duration_hours, availability) VALUES
('indiranagar horror story','chandra',22,1);

select * from Login;

select * from Course;