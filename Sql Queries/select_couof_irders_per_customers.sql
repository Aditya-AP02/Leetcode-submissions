-- purpose : select count of orders per customer

select customer_id, count(*) as total_orders
from customer 
group by customer_id

git status --short -- "Sql Queries/retrieve_all_employee_who_joined_in_specific_year.sql"; git add -- "Sql Queries/retrieve_all_employee_who_joined_in_specific_year.sql"; git commit -m "Add employees joined in specific year query"; git push origin main