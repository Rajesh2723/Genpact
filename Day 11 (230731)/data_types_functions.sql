CREATE DATABASE testdb;

use testdb;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2),
    hire_date DATE,
	city VARCHAR(50),
    coordinates POINT
);

INSERT INTO employees (first_name, last_name, salary, hire_date, city, coordinates)
VALUES
    ('Aarav', 'Sharma', 25000.50, '2023-01-15', 
    'New York', POINT(-74.006, 40.7128)),
    ('Aisha', 'Verma', 35000.75, '2022-09-05', 
    'Los Angeles', POINT(-118.2437, 34.0522)),
    ('Vikram', 'Singh', 18000.25, '2023-04-22', 
    'London', POINT(-0.1278, 51.5074));

# String Functions
# 1st variation
SELECT CONCAT(first_name, ' ' , last_name) FROM employees;

# 2nd variation
SELECT CONCAT(first_name, space(2) , last_name) AS full_name 
FROM employees;

SELECT substring(first_name, 2, 3) AS substr_first_name
FROM employees; 

SELECT UPPER(first_name) AS upper_first_name
FROM employees;

SELECT LOWER(last_name) AS lower_last_name
FROM employees;

SELECT last_name, LENGTH(last_name) AS length_last_name 
FROM employees;

# Numerical Functions
SELECT first_name, last_name, ROUND(salary, 2) AS rounded_salary
FROM employees;

SELECT first_name, last_name, ROUND(salary, 1) AS rounded_salary
FROM employees;

# Final answer removes decimal and gives us a whole num
SELECT first_name, last_name, CEIL(salary) AS ceiled_salary
FROM employees;

SELECT first_name, last_name, FLOOR(salary) AS floored_salary
FROM employees;

SELECT first_name, last_name, ABS(salary) AS absolute_salary
FROM employees;

SELECT first_name, last_name, POWER(salary, 2) AS salary_squared
FROM employees;

# Date-Time Functions
SELECT NOW() AS current_date_time;

UPDATE employees SET hire_date = curdate() WHERE id = 3;

# Test with %Y, %M, %m, %d
SELECT first_name, last_name, 
DATE_FORMAT(hire_date, '%Y') AS hire_year 
FROM employees;

# Try with +/- , MONTH/YEAR/DAY
SELECT first_name, last_name, 
DATE_ADD(hire_date, INTERVAL 3 MONTH) AS new_hire_date
FROM employees;

SELECT first_name, last_name, 
DATE_ADD(hire_date, INTERVAL -3 YEAR) AS new_hire_date
FROM employees;

SELECT first_name, last_name, 
DATEDIFF(NOW(), hire_date) AS days_employed
FROM employees;

SELECT
	TIMESTAMPDIFF( YEAR, hire_date, now() ) as _year
    , TIMESTAMPDIFF( MONTH, hire_date, now() ) % 12 as _month
    , FLOOR( TIMESTAMPDIFF( DAY, hire_date, now() ) % 30.4375 ) as _day
FROM 
    employees;
    
SELECT first_name, last_name, 
EXTRACT(DAY FROM hire_date) AS day, 
EXTRACT(MONTH FROM hire_date) AS month,
EXTRACT(YEAR FROM hire_date) AS year
FROM employees;

# Spatial Function
SELECT ST_X(coordinates) as longitude, ST_Y(coordinates) as latitude
FROM employees;