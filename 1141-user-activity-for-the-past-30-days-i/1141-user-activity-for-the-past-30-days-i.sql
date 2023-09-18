# Write your MySQL query statement below
select activity_date as day, count(distinct user_id) as active_users
from Activity where activity_date between '2019-07-28' - interval 30 day and '2019-07-27' and activity_type in ('open_session', 'end_session', 'scroll_down', 'send_message') group by 1 order by 1