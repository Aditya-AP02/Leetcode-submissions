--purpose : find employees without department (Uber)

select e.*
from employee e 
left join department d on e.department_id = d.department_id
where d.department_id is null;