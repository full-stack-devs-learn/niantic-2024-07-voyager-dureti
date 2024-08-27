-- 18. Count the number of customers in each country
-- include the country and total_customer_count
-- (use customers table)

-- (21 rows)

USE northwind;

SELECT country
		, COUNT(customer_id) AS total_customer_count
FROM customers
GROUP BY country
ORDER BY total_customer_count DESC;




