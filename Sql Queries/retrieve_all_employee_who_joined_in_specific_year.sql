--purpose : retrive all the employees who joined in year 2023

select * from employee
where extract (year from hire_date) = 2023;

