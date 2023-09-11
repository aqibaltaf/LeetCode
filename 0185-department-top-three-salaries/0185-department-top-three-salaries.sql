# Write your MySQL query statement below
SELECT d.name as "Department", e.name as "Employee", e.salary as "Salary"
FROM (
  SELECT e.*, DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS Highest_salary
  FROM Employee e
) AS e
JOIN Department d ON e.departmentId = d.id
WHERE e.Highest_salary < 4;