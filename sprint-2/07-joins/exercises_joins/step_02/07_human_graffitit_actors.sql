-- 7. List the names of all actors who acted in
-- the film "HUMAN GRAFFITI"

-- (4 rows)

USE sakila;


SELECT a.first_name, a.last_name
FROM actor a
INNER JOIN 
	film_actor fa ON a.actor_id = fa.actor_id
INNER JOIN 
	film f ON fa.film_id = f.film_id
WHERE f.title = 'HUMAN GRAFFITI';


