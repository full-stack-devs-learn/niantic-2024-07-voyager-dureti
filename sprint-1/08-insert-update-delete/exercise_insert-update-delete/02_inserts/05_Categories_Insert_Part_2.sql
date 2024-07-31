USE northwind;

-- Select the new Category id

SELECT LAST_INSERT_ID();
SET @new_id = last_insert_id();

SELECT @new_id;

