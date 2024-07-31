USE northwind;

-- The product name, price of all products
-- that cost at least $30

-- Expected: 25 rows

SELECT product_name
	, unit_price
FROM products
WHERE UNIT_PRICE >= 30;

