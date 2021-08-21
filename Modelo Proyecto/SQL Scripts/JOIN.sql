USE sakila;

SELECT actor.first_name, actor.last_name, film.title, film.description
FROM actor
LEFT JOIN film_actor
ON actor.actor_id = film_actor.actor_id
LEFT JOIN film
ON film_actor.film_id = film.film_id
WHERE film.title IS NULL;

-- cliente que invirtió más en el último año
SELECT c.customer_id, c.first_name, c.last_name, c.email, p.amount, sum(amount) as total, p.payment_date
FROM customer as c
JOIN payment as p
ON c.customer_id = p.customer_id
WHERE p.payment_date BETWEEN "20210101" AND "20210821"
GROUP BY c.customer_id
ORDER BY total DESC