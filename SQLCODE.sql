CREATE TABLE Students (
    id INT,
    name VARCHAR(50),
    age INT
);

INSERT INTO Students VALUES (1, 'Rahul', 20);

SELECT * FROM Students;

UPDATE Students SET age = 21 WHERE id = 1;

DELETE FROM Students WHERE id = 1;
