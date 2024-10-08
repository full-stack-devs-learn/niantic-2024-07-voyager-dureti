USE northwind;

-- Delete the Sporting Goods Catregory from the database.

-- Why does it fail to delete?

-- What else needs to be done to fully delete the Category?

-- Write a script that preforms all necessary steps to 
-- delete the category from the database.

-- The only user input should be a variable at the top of the 
-- script that holds the Category Name.
-- The sript should do the rest

SELECT @sport_category := category_id
FROM categories
WHERE category_name = 'Sporting Goods';

-- testing before deleting
SELECT *
FROM products
WHERE category_id = @sport_category;

-- delete from product table
DELETE FROM products
WHERE category_id = @sport_category;

-- testing before deleting 
SELECT *
FROM categories;


DELETE FROM categories
WHERE category_name = 'Sporting Goods'; 

-- confirm 
SELECT * 
FROM categories;


