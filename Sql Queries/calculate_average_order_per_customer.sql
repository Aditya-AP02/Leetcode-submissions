-- purpose : retrieve average order price for customers

select customer_id , avg(total_amount) as avg_order_value
from customers 
group_by customer_id