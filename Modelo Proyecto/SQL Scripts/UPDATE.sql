USE sakila;

SELECT * 
FROM payment;

UPDATE payment
SET payment_date = "2021-08-21"
WHERE customer_id = 2;

UPDATE payment
SET payment_date = "2021-08-21", staff_id = 2
WHERE customer_id = 2;

