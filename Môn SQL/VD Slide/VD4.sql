/*This example returns only the rows for DimEmployee that have an 
EndDate that is not NULL and a MaritalStatus of 'M' (married).*/
--SELECT FirstName, LastName, StartDate AS FirstDay  
--FROM DimEmployee   
--WHERE EndDate IS NOT NULL   
--AND MaritalStatus = 'M'  
--ORDER BY LastName;
SELECT JobTitle JobName, MaritalStatus,HireDate AS StartDate 
FROM HumanResources.Employee
WHERE HireDate IS NOT NULL
AND MaritalStatus='S'


--SELECT FirstName, LastName, BaseRate, BaseRate * 40 AS GrossPay  
--FROM DimEmployee  
--ORDER BY LastName;
SELECT Name,ListPrice,StandardCost * 0.5 as discount
FROM Production.Product
WHERE ListPrice > 0

--SELECT DISTINCT Title  
--FROM DimEmployee  
--ORDER BY Title;

SELECT DISTINCT Color
FROM Production.Product
