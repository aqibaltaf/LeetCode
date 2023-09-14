# Write your MySQL query statement below
with last_price as (
    select *, rank() over(partition by product_id order by change_date desc) as last_price_changed_date
    from Products where change_date <= '2019-08-16'
)
select product_id, new_price as price
from last_price
where last_price_changed_date = 1
UNION
select product_id, 10 as price
from Products
where product_id not in (select product_id from last_price)