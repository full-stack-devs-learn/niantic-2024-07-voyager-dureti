-- 13. Category popularity report

-- return a list of category names and the number of times
-- a film in that category has been rented

-- sort by most popular category first

-- (16 rows)

USE sakila;

SELECT c.name AS category_name
		, COUNT(r.rental_id) AS rental_count
FROM category c
INNER JOIN 
	film_category fc ON c.category_id = fc.category_id
INNER JOIN 
	film f ON fc.film_id = f.film_id
INNER JOIN 
	inventory i ON f.film_id = i.film_id
LEFT JOIN 
	rental r ON i.inventory_id = r.inventory_id
GROUP BY c.name
ORDER BY rental_count DESC;
