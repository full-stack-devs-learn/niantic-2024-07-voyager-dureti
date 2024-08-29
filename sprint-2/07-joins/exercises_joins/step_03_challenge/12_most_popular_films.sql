-- 12. Most Popular film report
-- return the name of the 10 most popular films
-- title and number of times each film was rented

-- which tables will you need to join?

--
-- (10 rows)

USE sakila;

SELECT f.title
	, COUNT(r.rental_id) AS rental_count
FROM film f
INNER JOIN 
	inventory i ON f.film_id = i.film_id
LEFT JOIN 
	rental r ON i.inventory_id = r.inventory_id
GROUP BY f.title
ORDER BY rental_count DESC
LIMIT 10;



