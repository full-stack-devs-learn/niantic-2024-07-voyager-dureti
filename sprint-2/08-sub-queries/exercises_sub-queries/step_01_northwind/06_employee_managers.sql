-- 4. Select the full name of each employee
-- using a sub-query also display the full name of the employees manager

-- NO JOINS allowed

-- employee             manager
-- ------------------   -------------------
-- Nancy Davolio        Andrew Fuller
-- Andrew Fuller        <null>
-- Janet Leverling      Andrew Fuller
-- Margaret Peacock     Andrew Fuller
-- Steven Buchanan      Andrew Fuller
-- Michael Suyama       Steven Buchanan
-- Robert King          Steven Buchanan
-- Laura Callahan       Andrew Fuller
-- Anne Dodsworth       Steven Buchanan


-- (9 rows)

USE northwind;


SELECT CONCAT(first_name, ' ', last_name) AS employee
    ,(SELECT CONCAT(e2.first_name, ' ', e2.last_name) 
		FROM Employees e2 
		WHERE e2.employee_id = e1.reports_To
	) AS manager
FROM 
    Employees e1