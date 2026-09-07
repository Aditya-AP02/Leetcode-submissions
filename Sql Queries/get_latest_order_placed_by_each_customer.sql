-- purpose : get latest order placed by each customer

SELECT customer_id, MAX(order_date) AS latest_order_date
FROM orders
GROUP BY customer_id;