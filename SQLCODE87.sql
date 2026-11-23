-- Step 1: Create Table
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT
);

-- Step 2: Insert Data
INSERT INTO Employee VALUES
(1, 'Rahul', 25000),
(2, 'Aman', 30000),
(3, 'Neha', 35000);

-- Step 3: Display Old Salary
SELECT * FROM Employee
WHERE id = 1;

-- Step 4: Update Salary
UPDATE Employee
SET salary = 40000
WHERE id = 1;

-- Step 5: Display Updated Salary
SELECT * FROM Employee
WHERE id = 1;
