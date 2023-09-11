CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE nthSalary INT;
  
  SET nthSalary = (
    SELECT DISTINCT salary
    FROM (
      SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS salary_rank
      FROM Employee
    ) ranked_salaries
    WHERE salary_rank = N
  );
  
  RETURN nthSalary;
END
