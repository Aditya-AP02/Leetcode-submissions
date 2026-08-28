-- purpose : Calculate total revenue per product

select product_id , sum(quantity * price) as total_revenue
from sales
group by product_id