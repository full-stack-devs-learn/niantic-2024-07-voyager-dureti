USE northwind;

-- You were just hired by Northwind Traders, Inc and 
-- you need to add yourself as a Sales Associate to the Employees table.
-- Inlcude your:
    -- full name
    -- job title
    -- preferred title (Mr, Mrs, etc)
    -- Birthday
    -- hire date: (today)
    -- home address
-- leave all other fields null by default

INSERT INTO employees
(
    first_name
    , last_name
    , title
    , title_of_courtesy
	, birth_date
    , hire_date
    , address
    , city
    , region
    , postal_code
    , country
    , notes
)
VALUES
(
    'Dureti'
    , 'Shemsi'
    , 'Student'
    , 'Ms.'
    , '1998-07-23'
    , '2024-07-31'
    , '1234 Elm Street'
    , 'Seattle'
    , 'WA'
    , 98144
    , 'USA'
    , ''
);


    