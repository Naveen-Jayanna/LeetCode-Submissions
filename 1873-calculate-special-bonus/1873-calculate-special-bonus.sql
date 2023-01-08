# Write your MySQL query statement below
SELECT employee_id,
salary * (employee_id%2) * (name NOT LIKE "M%") AS bonus
FROM employees
ORDER BY employee_id;


# SELECT employee_id,
# IF (employee_id%2 AND name not like "M%", salary, 0) as bonus
# FROM employees order by employee_id;