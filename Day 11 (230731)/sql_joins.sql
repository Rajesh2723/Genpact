create schema sql_joins;

use sql_joins;

CREATE TABLE customers (
  customer_id int NOT NULL,
  customer_name varchar(45) NOT NULL,
  customer_email varchar(45) NOT NULL,
  PRIMARY KEY (customer_id)
);

INSERT INTO customers VALUES 
(1,'Vinod','vinod@gmail.com'),
(2,'Ajay','ajay@rediff.com'),
(3,'Jayesh','jay@yahoo.com'),
(5,'Hiten','hiten@gmail.com'),
(8,'Vijay','vijay@gmail.com');

CREATE TABLE orders (
  order_id int NOT NULL,
  order_date date NOT NULL,
  order_amount double DEFAULT NULL,
  customer_id int DEFAULT NULL,
  PRIMARY KEY (order_id)
);

INSERT INTO orders VALUES 
(1,'2022-05-05',890,1),
(2,'2022-05-06',765,2),
(3,'2022-06-05',200,1),
(4,'2021-05-05',389,3),
(5,'2021-05-05',800,6),
(6,'2022-05-05',800,7);

# Inner Join
SELECT c.customer_id, c.customer_name, o.order_date, o.order_id
FROM customers AS c
INNER JOIN orders AS o
ON c.customer_id = o.customer_id;

#Left Outer Join
SELECT c.customer_id, c.customer_name, o.order_date, o.order_id
FROM customers AS c
LEFT JOIN orders AS o
ON c.customer_id = o.customer_id;

#RIGHT Outer Join
SELECT c.customer_id, c.customer_name, o.order_date, o.order_id
FROM customers AS c
RIGHT JOIN orders AS o
ON c.customer_id = o.customer_id;

#FULL/CROSS Join -> Left Join Union Right Join
#(Left Join) Union (Right Join)

(SELECT c.customer_id, c.customer_name, o.order_date, o.order_id
FROM customers AS c
LEFT JOIN orders AS o
ON c.customer_id = o.customer_id)
UNION
(SELECT c.customer_id, c.customer_name, o.order_date, o.order_id
FROM customers AS c
RIGHT JOIN orders AS o
ON c.customer_id = o.customer_id);







