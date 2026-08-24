--purpose: find duplicate records based on column1 and column2

select column1, column2, count(*) 
from your_table 
group by column1,column2 
having count(*) > 1