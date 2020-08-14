USE AdventureWorks2016CTP3
GO
CREATE PROCEDURE Display_Customers
AS
SELECT CustomerID,AccountNumber,rowguid, ModifiedDate 
From Sales.Customer

EXECUTE Display_Customers

EXECUTE xp_fileexist 'c:\myTest.txt'

EXECUTE sys.sp_who