-- Drop database if it exists
DROP DATABASE IF EXISTS budget;

-- Create the database
CREATE DATABASE budget;

USE budget;

-- Create persons table
CREATE TABLE IF NOT EXISTS persons (
    person_id INT PRIMARY KEY AUTO_INCREMENT,
    person_name VARCHAR(50) NOT NULL
);

-- Create categories table
CREATE TABLE IF NOT EXISTS categories (
    category_id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(50) NOT NULL
);

-- Create subcategories table
CREATE TABLE IF NOT EXISTS subcategories (
    subcategory_id INT PRIMARY KEY AUTO_INCREMENT,
    category_id INT,
    subcategory_name VARCHAR(50) NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

-- Create vendors table
CREATE TABLE IF NOT EXISTS vendors (
    vendor_id INT PRIMARY KEY AUTO_INCREMENT,
    vendor_name VARCHAR(100) NOT NULL
);

-- Create transactions table
CREATE TABLE IF NOT EXISTS transactions (
    transaction_id INT PRIMARY KEY AUTO_INCREMENT,
    transaction_date DATE NOT NULL,
    person_id INT,
    category_id INT,
    subcategory_id INT,
    vendor_id INT,
    transaction_amount DECIMAL(10, 2) NOT NULL,
    notes TEXT,
    FOREIGN KEY (person_id) REFERENCES persons(person_id),
    FOREIGN KEY (category_id) REFERENCES categories(category_id),
    FOREIGN KEY (subcategory_id) REFERENCES subcategories(subcategory_id),
    FOREIGN KEY (vendor_id) REFERENCES vendors(vendor_id)
);
