# Write your MySQL query statement below
Select user_id, name, mail from Users
where mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\.com$' and mail not REGEXP '\\?'