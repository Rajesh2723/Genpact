# Create schema ecom
# Select schema ecom
# Create 5 tables to store data about 
# customers, products, product categories, orders, order details
create schema ecom;

use ecom;

create table customers (
customerId int not null auto_increment primary key,
firstName varchar(15) not null,
lastName varchar(15) not null,
email varchar(30) not null,
password varchar(15) not null
);

create table categories (
	categoryId int not null auto_increment primary key,
    name varchar(15) not null
);

create table products(
productId int not null auto_increment primary key,
name varchar(15) not null,
price decimal(5,2) not null,
categoryId int not null,
foreign key (categoryId) references categories (categoryId)
);

create table customer_orders (
orderId int not null auto_increment primary key,
customerId int not null,
orderDate date not null,
foreign key (customerId) references customers (customerId)
);

create table order_products (
orderId int not null,
productId int not null,
quantity int not null,
primary key (orderId, productId),
foreign key (orderId) references customer_orders (orderId),
foreign key (productId) references products (productId)
);

insert into customers (`firstName`, `lastName`, `email`, `password`) 
values ('Harsh', 'Nair', 'harsh@gmail.com', 1234), 
('Manish', 'Joshi', 'manish@yahoo.com', 2345), 
('Garima', 'Thakur', 'garima@rediff.com', 3456), 
('Gaurav', 'Sharma', 'gaurav@gmail.com', 4567), 
('Rahul', 'Patil', 'rahul@rediff.com', 5678);

insert into categories (name) 
values 
('Electronics'), 
('Apparels'), 
('Eatables');

#Electronics (Laptop, Smart Watch, Tablet)
#Apparels (Trouser, T-Shirt, Suit)
#Eatables(Namkeen, Knorr Soup, Ketchup)

insert into products 
(name, price, categoryId) values 
('Laptop', 35000, 1),
('Trouser', 1199.99, 2),
('Namkeen', 74.99, 3),
('T-shirt', 1999.99, 2),
('Suit', 16999.99, 2),
('Smart Watch', 18000, 1),
('Knorr Soup', 19.99, 3),
('Tablet', 17999.99, 1),
('Ketchup', 31.99, 3);

# Harsh (customer id = 1)
# On 2nd July 2023, Harsh has made 1st order of 2 items 
# - 2 trousers and 2 T-shirts
# On 4th July, Harsh made a 2nd order of 2 items
# - 4 packets of knorr soup and 1 bottle of ketchup
# Garima (customer id = 3)
# On 3rd July, Garima has made 1 order of 3 packets of namkeen
# Gaurav (customer id = 4) has made 2 orders on same day
# On 5th July he has bought 1 laptop
# On 5th July he has bought 1 T-Shirt

insert into customer_orders (customerId, orderDate) values
(1, '2023-07-02'),
(3, '2023-07-03'),
(1, '2023-07-04'),
(4, '2023-07-05'), (4, '2023-07-05');

# Order 1 - 2 trousers (pid=2) and 2 T-shirts (pid=4)
# Order 2 - 3 Packets of Namkeen ()
# Order 3 - 4 packets of knorr soup (7) and 1 bottle of ketchup (9)
# Order 4 - 1 laptop (1)
# Order 5 - 1 T-shirt (4)

insert into order_products 
(`orderId`, `productId`, `quantity`) values 
(1, 2, 2),
(1, 4, 2),
(2, 3, 3),
(3, 7, 4),
(3, 9, 1),
(4, 1, 1),
(5, 4, 1);

# Joins - These are used to query multiple tables at once
# 4 types -> Inner Join, Left Outer Join, Right Outer Join, Full Outer Join

# Inner Join
# Syntax
# select <list-of-columns from both tables> from table1 Inner join table2
# where table1.matchinColumn = table2.matchingColumn

# Problem 1: Get the categories and their products
# Aliases c, p
select c.categoryId, c.name, p.name, p.price
from categories AS c
inner join products AS p
ON c.categoryId = p.categoryId; 

# Problem 2: Get the date on which customer made orders
select c.firstName, co.orderDate
from customers AS c
inner join customer_orders as co
ON c.customerId = co.customerId;

# Problem 3: Get the customers name and the products they bought
select c.firstName, p.name, op.quantity, co.orderDate
from customers AS c
inner join customer_orders as co
on c.customerId = co.customerId
inner join order_products AS op
on co.orderId = op.orderId
inner join products AS p
on op.productId = p.productId;

# Left join
# Get the detail of all customers whether they have purchased something or not
select c.firstName, p.name, op.quantity, co.orderDate
from customers AS c
left join customer_orders as co
on c.customerId = co.customerId
left join order_products AS op
on co.orderId = op.orderId
left join products AS p
on op.productId = p.productId;

# Right join
# Get the details of all the orders that
# are made by non registered customers (not possible)
# Strong entity (customer) and Weak Entity (order)
select c.firstName, co.orderDate
from customers AS c
right join customer_orders as co
on c.customerId = co.customerId;