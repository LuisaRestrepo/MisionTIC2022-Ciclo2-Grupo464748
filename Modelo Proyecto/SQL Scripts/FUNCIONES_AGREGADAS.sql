USE sakila;

SELECT *
FROM payment;

SELECT count(*) as cantidad_pagos,
sum(amount) as suma,
min(amount) as minimo,
max(amount) as maximo,
avg(amount) as promedio
FROM payment
WHERE payment_date BETWEEN "20210101" AND "20210821";