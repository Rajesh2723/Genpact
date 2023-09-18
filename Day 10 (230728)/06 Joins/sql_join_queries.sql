/* Fetching the customers who have made a purchase and whose details are in customers table */
SELECT customers.customer_id, customers.customer_name, orders.order_date, orders.order_id
FROM customers
INNER JOIN orders
ON
customers.customer_id = orders.customer_id;

/* Fetching the data of all the customers whether or not they have made a purchase */
SELECT customers.customer_id, customers.customer_name, orders.order_date, orders.order_id
FROM customers
LEFT JOIN orders
ON
customers.customer_id = orders.customer_id;


/* Fetching the data of all the orders */
SELECT orders.order_id, orders.order_date, customers.customer_id, customers.customer_name
FROM customers
RIGHT JOIN orders
ON
customers.customer_id = orders.customer_id;

/* Fetching the data of all the orders and customers */
(SELECT orders.order_id, orders.order_date, customers.customer_id, customers.customer_name
FROM customers
LEFT JOIN orders
ON
customers.customer_id = orders.customer_id) 

UNION

(SELECT orders.order_id, orders.order_date, customers.customer_id, customers.customer_name
FROM customers
RIGHT JOIN orders
ON
customers.customer_id = orders.customer_id) ;






