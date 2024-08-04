USE budget;

-- All categories - by month

SELECT 
    DATE_FORMAT(transaction_date, '%Y-%m') AS month
    , categories.category_name
    , SUM(transactions.transaction_amount) AS total_amount
FROM 
    transactions
JOIN 
    categories ON transactions.category_id = categories.category_id
GROUP BY 
    DATE_FORMAT(transaction_date, '%Y-%m')
    , categories.category_name
ORDER BY 
    month 
    , categories.category_name;
    

-- Housing expenses - by Month

SELECT
    DATE_FORMAT(t.transaction_date, '%Y-%m') AS month
    , c.category_name
    , SUM(t.transaction_amount) AS total_amount
FROM 
    transactions t
INNER JOIN 
    subcategories sc ON t.subcategory_id = sc.subcategory_id
INNER JOIN 
    categories c ON sc.category_id = c.category_id
WHERE 
    c.category_name = 'Housing'
GROUP BY 
    DATE_FORMAT(t.transaction_date, '%Y-%m')
    , c.category_name
ORDER BY 
    month;

-- Total Expenses by Category
SELECT 
    c.category_name, 
    SUM(t.transaction_amount) AS total_amount
FROM 
    transactions t
JOIN 
    categories c ON t.category_id = c.category_id
GROUP BY 
    c.category_name
ORDER BY 
    total_amount DESC;

-- Total expense by person 

SELECT 
    p.person_name, 
    SUM(t.transaction_amount) AS total_amount
FROM 
    transactions t
JOIN 
    persons p ON t.person_id = p.person_id
GROUP BY 
    p.person_name
ORDER BY 
    total_amount DESC;


