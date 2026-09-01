--purpose : to find a customer that purhcase a product but never return a poroduct

select distinct c.customer_id 
from customer c
where exists(
    select 1
    from orders o
    where o.customer_id = c.customer_id
  )and not exists (
    select 1
    from returns r
    where r.customer_id = c.customer_id
);

select distinct c.customer_id 
from customers c
join orders o on c.customer_id = o.customer_id
where c.customer_id not in (select customer_id from returns)