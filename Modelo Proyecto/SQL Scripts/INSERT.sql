USE sakila;

SELECT * 
FROM customer
ORDER BY customer_id DESC;

INSERT INTO customer
(store_id, first_name, last_name, address_id, active,create_date)
VALUES 
(1,"SANTIAGO","MONTOYA",10,1,"20210821"),
(1,"MARIA","DOSSMAN",10,1,"20210821");

SELECT * 
FROM customer
WHERE email IS NULL;

