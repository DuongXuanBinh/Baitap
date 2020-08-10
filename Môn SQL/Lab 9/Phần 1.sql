USE AdventureWorks2016CTP3
GO
CREATE VIEW ProductList
AS SELECT ProductID, Name FROM AdventureWorks2016CTP3.Production.Product
GO
SELECT * FROM ProductList
GO
CREATE VIEW SalesOrderDetail
AS SELECT pr.ProductID, pr.Name, od.UnitPrice, od.OrderQty, od.UnitPrice*od.OrderQty as TotalPrice FROM AdventureWorks2016CTP3.Sales.SalesOrderDetail od
JOIN AdventureWorks2016CTP3.Production.Product pr
ON od.ProductID=pr.ProductID
GO
SELECT * FROM SalesOrderDetail