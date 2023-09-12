# Write your MySQL query statement below
select r.contest_id,  ROUND(COUNT(DISTINCT r.user_id) * 100.0 / (SELECT COUNT(DISTINCT user_id) FROM Users), 2) AS percentage from Users as u join Register as r on u.user_id = r.user_id
group by 1 order by 2 desc, 1 asc