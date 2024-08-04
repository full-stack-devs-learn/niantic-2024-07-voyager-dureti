-- Use the budget database
USE budget;

-- Insert sample persons
INSERT INTO persons (person_name) VALUES 
('Alice'),
('Bob');

-- Insert categories with predefined IDs
INSERT INTO categories (category_id, category_name) VALUES 
(1, 'Housing'),
(2, 'Transportation'),
(3, 'Food'),
(4, 'Healthcare'),
(5, 'Entertainment'),
(6, 'Vacation/Travel');

-- Insert subcategories with predefined IDs
INSERT INTO subcategories (subcategory_id, category_id, subcategory_name) VALUES 
(1, 1, 'Rent'),
(2, 1, 'Utilities'),
(3, 1, 'Internet'),
(4, 2, 'Gas'),
(5, 2, 'Subway'),
(6, 2, 'Car Maintenance'),
(7, 3, 'Groceries'),
(8, 3, 'Restaurant'),
(9, 3, 'Snacks'),
(10, 4, 'Rx'),
(11, 4, 'Dr Visit'),
(12, 4, 'OTC Medicine'),
(13, 5, 'Movies'),
(14, 5, 'Netflix'),
(15, 5, 'Sports'),
(16, 6, 'Flight'),
(17, 6, 'Hotel'),
(18, 6, 'Car Rental');

-- Insert vendors with predefined IDs
INSERT INTO vendors (vendor_id, vendor_name) VALUES 
(1, 'Landlord'),
(2, 'Shell'),
(3, 'Walmart'),
(4, 'CVS'),
(5, 'AMC'),
(6, 'Delta Airlines'),
(7, 'Power Company'),
(8, 'Subway Station'),
(9, 'Olive Garden'),
(10, 'Doctor Office'),
(11, 'Netflix Inc'),
(12, 'Holiday Inn'),
(13, 'Auto Repair Shop'),
(14, 'Snack Bar'),
(15, 'Pharmacy'),
(16, 'Sports Center'),
(17, 'Car Rental Company'),
(18, 'ISP');

-- Insert sample transactions (30 transactions spanning two months)
INSERT INTO transactions (transaction_date, person_id, category_id, subcategory_id, vendor_id, transaction_amount, notes) VALUES 
('2024-06-01', 1, 1, 1, 1, 1200.00, 'June Rent'),
('2024-06-02', 2, 2, 4, 2, 50.00, 'Gas for the car'),
('2024-06-03', 1, 3, 7, 3, 100.00, 'Weekly groceries'),
('2024-06-04', 2, 4, 10, 4, 30.00, 'Prescription medication'),
('2024-06-05', 1, 5, 13, 5, 15.00, 'Movie night with friends'),
('2024-06-06', 2, 6, 16, 6, 300.00, 'Flight to NY for business trip'),
('2024-06-07', 1, 1, 2, 7, 100.00, 'June Utilities payment'),
('2024-06-08', 2, 2, 5, 8, 20.00, 'Subway fare'),
('2024-06-09', 1, 3, 8, 9, 50.00, 'Dinner at Olive Garden'),
('2024-06-10', 2, 4, 11, 10, 100.00, 'Annual Checkup with Doctor'),
('2024-06-11', 1, 5, 14, 11, 15.00, 'Monthly Netflix Subscription'),
('2024-06-12', 2, 6, 17, 12, 200.00, 'Hotel Stay during trip'),
('2024-06-13', 1, 1, 2, 7, 50.00, 'Additional Utility Charges'),
('2024-06-14', 2, 2, 6, 13, 200.00, 'Car Service at Auto Repair Shop'),
('2024-06-15', 1, 3, 9, 14, 10.00, 'Snacks from Snack Bar'),
('2024-06-16', 2, 4, 12, 15, 20.00, 'OTC Medicine from Pharmacy'),
('2024-06-17', 1, 5, 15, 16, 25.00, 'Gym Membership at Sports Center'),
('2024-06-18', 2, 6, 18, 17, 150.00, 'Rental Car during vacation'),
('2024-06-19', 1, 3, 7, 3, 80.00, 'Groceries for the week'),
('2024-06-20', 2, 1, 3, 18, 60.00, 'Monthly Internet bill'),
('2024-07-01', 1, 1, 1, 1, 1200.00, 'July Rent'),
('2024-07-02', 2, 2, 4, 2, 55.00, 'Gas for the car'),
('2024-07-03', 1, 3, 7, 3, 110.00, 'Weekly groceries'),
('2024-07-04', 2, 4, 10, 4, 35.00, 'Prescription medication'),
('2024-07-05', 1, 5, 13, 5, 17.00, 'Movie night with friends'),
('2024-07-07', 1, 1, 2, 7, 105.00, 'July Utilities payment'),
('2024-07-08', 2, 2, 5, 8, 25.00, 'Subway fare'),
('2024-07-09', 1, 3, 8, 9, 60.00, 'Dinner at Olive Garden');
