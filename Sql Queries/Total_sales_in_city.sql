-- purpose : find sum of amount purchased by each city

select customer_city, sum(amount)
from customer
group by customer_city