USE sakila;
-- comentario
SELECT * FROM customer;

SELECT customer_id,first_name,last_name, email FROM customer;

SELECT customer_id,first_name,last_name, email,active 
FROM customer
WHERE active = 0
LIMIT 10;

SELECT customer_id,first_name,last_name, email,active 
FROM customer
WHERE active = 0 AND first_name = "SANDRA"
LIMIT 10;

SELECT customer_id,first_name,last_name, email,active 
FROM customer
WHERE first_name LIKE 'A%'
LIMIT 10;

SELECT customer_id,first_name,last_name, email,active 
FROM customer
WHERE first_name LIKE '%X%'
LIMIT 10;

SELECT customer_id,first_name,last_name, email,active 
FROM customer
WHERE first_name IN ("SANDRA","ALEX")
LIMIT 10;

SELECT *
FROM payment
WHERE amount != 5.99;

SELECT *
FROM payment
WHERE amount BETWEEN 0 AND 2.99