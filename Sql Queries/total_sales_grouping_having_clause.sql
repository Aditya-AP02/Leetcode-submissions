select city, sum(amount)
from orders
where amount > 400
group by city
having sum(amount) >= 700
