-- 20. Return the State with the most number of orders placed.
-- Include state / region and order_count.
-- (use customer_orders view)

-- do not include any orders for customers whose state/region is unknow

-- (1 rows)
-- SP   49

USE northwind;

SELECT region AS state
		, COUNT(DISTINCT order_id) as order_count
FROM customer_orders
WHERE region IS NOT NULL 
GROUP BY region
ORDER BY order_count DESC
LIMIT 1;




