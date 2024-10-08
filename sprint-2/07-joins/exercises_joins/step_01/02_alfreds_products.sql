-- 2. The name of all products that
-- have been ordered by Alfreds Futterkiste
-- Include each product only once
-- (11 rows)

USE Northwind;

SELECT DISTINCT p.product_name
FROM 
	products p
INNER JOIN 
	order_details od ON p.product_id = od.product_id
INNER JOIN 
	orders o ON od.order_id = o.order_id
INNER JOIN 
	customers c ON o.customer_id = c.customer_id
WHERE c.company_name = 'Alfreds Futterkiste';



