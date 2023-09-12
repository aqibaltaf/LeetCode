# Write your MySQL query statement below
select d.name as "Department", e.name as Employee, e.salary as Salary
from (
        select e.*, Dense_Rank() over(partition by e.departmentId order by e.salary desc) as salary_rank from Employee e
) as e join Department as d on e.departmentId = d.id where e.salary_rank = 1