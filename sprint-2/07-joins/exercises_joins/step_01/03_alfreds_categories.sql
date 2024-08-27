-- 3.  List of all the categories 
-- that Alfreds Futterkiste has ever ordered
-- (5 rows)

USE Northwind;

SELECT DISTINCT cat.category_name
FROM 
	categories cat
INNER JOIN
	products p ON cat.category_id = p.category_id
INNER JOIN 
	order_details od ON p.product_id = od.product_id
INNER JOIN 
	orders o ON od.order_id = o.order_id
INNER JOIN 
	customers c ON o.customer_id = c.customer_id
WHERE c.company_name = 'Alfreds Futterkiste';



