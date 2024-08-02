USE northwind;

-- Write a script that updates the price of all products 
-- within a category by a certain percent.
-- use variables to accept the Category name and the percent increase 

SET @category_name = 'Sporting Goods'
	, @percent_increase = 1.5;

SELECT @category_id:=category_id
FROM categories
WHERE category_name = @category_name;

SELECT product_id
	, product_name
    , unit_price
    , (unit_price * @percent_increase) AS new_price
    , category_id
FROM products
WHERE category_id = @category_id;

UPDATE products
SET unit_price = unit_price * @percent_increase
WHERE category_id = @category_id;

