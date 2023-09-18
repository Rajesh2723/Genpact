CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    price DECIMAL(10, 2)
);

CREATE INDEX idx_product_name ON products (product_name);

DROP INDEX idx_product_name ON products;

#Temporary Tables
CREATE SCHEMA test;

USE test;

SHOW tables;

CREATE TEMPORARY TABLE user (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(15) NOT NULL
);

INSERT INTO user 
(name) 
VALUES 
('Jay'),
('Yash'),
('Ravi');

SELECT * from user;

show tables;