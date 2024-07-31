USE northwind;

-- Use the CustomerOrders view that we created
-- return the: CompanyName, OrderDate, OrderId,
-- ProductName, SalesPrice, Quantity, Discount and LineTotal
-- for all orders placed by 'Alfreds Futterkiste'

-- Hint: LineTotal is a calculated field based on
-- the SalesPrice, Quantity and Discount of each line item

-- the LineTotal for 'Rössle Sauerkraut' ordered on 2022-08-25
-- should be 513 (not 684)

-- Expected: 12 Rows

SELECT company_name
	, order_date
    , order_id
    , product_name
    , sales_price
	, quantity
    , discount
    , (sales_price * Quantity * (1 - Discount / 100)) AS LineTotal
FROM customer_orders
WHERE Company_name = 'Alfreds Futterkiste';



