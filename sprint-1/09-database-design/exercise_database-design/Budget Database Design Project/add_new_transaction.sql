USE budget;

-- Declare initial variables
SET @person_name = 'Bob'
    , @subcategory_name = 'Restaurant'
    , @vendor_name = 'Olive Garden'
    , @transaction_date = '2024-07-10'
    , @transaction_amount = 75.00
    , @notes = 'Dinner at Olive Garden with friends';

-- Select person_id based on person_name
SELECT @person_id := person_id
FROM persons
WHERE person_name = @person_name;

-- Select subcategory_id based on subcategory_name
SELECT @subcategory_id := subcategory_id
FROM subcategories
WHERE subcategory_name = @subcategory_name;

-- Select vendor_id based on vendor_name
SELECT @vendor_id := vendor_id
FROM vendors
WHERE vendor_name = @vendor_name;

-- Insert transaction using selected variables
INSERT INTO transactions
(
    transaction_date
    , person_id
    , category_id
    , subcategory_id
    , vendor_id
    , transaction_amount
    , notes
)
VALUES
(
    @transaction_date
    , @person_id
    , (
        SELECT category_id 
        FROM subcategories 
        WHERE subcategory_id = @subcategory_id
        )
    , @subcategory_id
    , @vendor_id
    , @transaction_amount
    , @notes
);
