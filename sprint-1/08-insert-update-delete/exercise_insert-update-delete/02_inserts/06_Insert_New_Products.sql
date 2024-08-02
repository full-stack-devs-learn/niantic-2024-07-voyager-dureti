USE northwind;

-- Insert 10 new products into the new Sporting Goods Category
-- You can leave the Supplier Id empty for now, but you need to include
-- the product name, category, price, units in stock (20), units on order (0)
-- and re-order level (10) for each product.

INSERT INTO products 
(
	product_name
    , category_id
    , unit_price
    , units_in_stock
    , units_on_order
    , reorder_level
)
VALUES 
    ('Basketball', @new_id, 29.99, 20, 0, 10),
    ('Soccer Ball', @new_id, 19.99, 20, 0, 10),
    ('Tennis Racket', @new_id, 89.99, 20, 0, 10),
    ('Baseball Glove', @new_id, 49.99, 20, 0, 10),
    ('Golf Clubs', @new_id, 299.99, 20, 0, 10),
    ('Camping Tent', @new_id, 199.99, 20, 0, 10),
    ('Sleeping Bag', @new_id, 79.99, 20, 0, 10),
    ('Fishing Rod', @new_id, 59.99, 20, 0, 10),
    ('Kayak', @new_id, 499.99, 20, 0, 10),
    ('Mountain Bike', @new_id, 599.99, 20, 0, 10);
    
    
