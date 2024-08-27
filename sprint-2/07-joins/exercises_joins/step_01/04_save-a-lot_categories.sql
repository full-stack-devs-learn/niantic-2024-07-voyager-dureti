-- 4. I want to know what category is the most popular
-- category for my best customer.

-- SELECT the Company Name, Category, and the OrderCount
-- for Save-a-lot Markets. (my best customer)
-- (the order count specifies how many times a category
-- was included in their orders)

-- sort in the order of the most ordered category to the least

-- (8 rows)

USE northwind;

SELECT c.company_name
       , cat.category_name
       , COUNT(*) AS order_count
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
WHERE c.company_name = 'Save-a-lot Markets'
GROUP BY 
	c.company_name, cat.category_name
ORDER BY 
	order_count DESC;


