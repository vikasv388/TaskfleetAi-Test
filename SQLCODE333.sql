CREATE TABLE Student (
    id INT,
    name VARCHAR(50),
    age INT,
    marks INT
);

INSERT INTO Student VALUES
(1, 'Rahul', 20, 85),
(2, 'Aman', 21, 90),
(3, 'Priya', 19, 75);

SELECT * FROM Student;

SELECT name, marks
FROM Student
WHERE marks  80;

UPDATE Student
SET marks  95
WHERE id  1;

DELETE FROM Student
WHERE id  3
