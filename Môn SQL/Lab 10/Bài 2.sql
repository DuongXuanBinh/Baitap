CREATE DATABASE Lab10
USE Lab10
GO
CREATE TABLE Toys(
ProductCode varchar(5) PRIMARY KEY,
Name varchar(30),
Category varchar(30),
Manufacturer varchar(40),
AgeRange varchar(15),
UnitPrice money,
Netweight int,
QtyOnHand int)
GO
INSERT INTO Toys VALUES ('A111','Police Office','Lap ghep','ABC Corp','3-5 tuoi',100.000,300,25)
INSERT INTO Toys VALUES ('A112','Racing','Game','ABC Corp','5-7 tuoi',150.000,500,23)
INSERT INTO Toys VALUES ('A113','Pikachu','Gau bong','ABC Corp','3-10 tuoi',200.000,350,52)
INSERT INTO Toys VALUES ('A114','Tau hoa','Tu dong','ABC Corp','3-5 tuoi',90.000,700,48)
INSERT INTO Toys VALUES ('A115','Ship','Lap ghep','ABC Corp','5-7 tuoi',300.000,600,22)
INSERT INTO Toys VALUES ('A116','Mining','Game','ABC Corp','5-15 tuoi',120.000,800,90)
INSERT INTO Toys VALUES ('A117','Contra','Game','ABC Corp','3-5 tuoi',150.000,450,43)
INSERT INTO Toys VALUES ('A118','O to','Dieu khien tu xa','ABC Corp','3-10 tuoi',300.000,800,27)
INSERT INTO Toys VALUES ('A119','Port','Lap ghep','ABC Corp','5-15 tuoi',80.000,550,29)
INSERT INTO Toys VALUES ('A120','May bay','Dieu khien tu xa','ABC Corp','3-5 tuoi',500.000,200,30)
INSERT INTO Toys VALUES ('A121','Xe may','Dieu khien tu xa','ABC Corp','5-7 tuoi',180.000,600,56)
INSERT INTO Toys VALUES ('A122','Doraemon','Gau bong','ABC Corp','3-5 tuoi',260.000,530,71)
INSERT INTO Toys VALUES ('A123','Donald','Gau bong','ABC Corp','3-10 tuoi',320.000,420,22)
INSERT INTO Toys VALUES ('A124','Theme Park','Lap ghep','ABC Corp','5-15 tuoi',110.000,330,34)
INSERT INTO Toys VALUES ('A125','Elsa','Tu dong','ABC Corp','5-7 tuoi',170.000,190,45)
GO
--2
CREATE PROC HeavyToys 
@Weight int
AS
SELECT * FROM Toys 
WHERE Netweight > @Weight
GO
-- 3
CREATE PROC PriceIncrease
@PricePlus money
AS
UPDATE Toys
SET UnitPrice = UnitPrice + @PricePlus
GO
-- 4
CREATE PROC QtyOnHand
@QtyPlus int
AS
UPDATE Toys
SET QtyOnHand = QtyOnHand - @QtyPlus
GO
--5
EXEC HeavyToys 500
GO
EXEC PriceIncrease 10
GO
EXEC QtyOnHand 5
GO
--6
EXEC sp_helptext 'HeavyToys'
--
SELECT DEFINITION FROM sys.sql_modules 
WHERE OBJECT_ID = OBJECT_ID('PriceIncrease')
--
SELECT OBJECT_DEFINITION (OBJECT_ID('QtyOnHand')) AS [Procedure Definition];   
GO
--7
EXEC sp_depends 'HeavyToys'
EXEC sp_depends 'PriceIncrease'
EXEC sp_depends 'QtyOnHand'
GO
--8
ALTER PROC PriceIncrease
@PricePlus money
AS
UPDATE Toys
SET UnitPrice = UnitPrice + @PricePlus
SELECT UnitPrice FROM Toys
GO
--
ALTER PROC QtyOnHand
@QtyPlus int
AS
UPDATE Toys
SET QtyOnHand = QtyOnHand - @QtyPlus
SELECT QtyOnHand FROM Toys
GO
--9
CREATE PROC SpecificPriceIncrease
AS
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
GO
EXEC SpecificPriceIncrease
GO
--10
ALTER PROC SpecificPriceIncrease
AS
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
SELECT * FROM Toys
GO
--12
ALTER PROC SpecificPriceIncrease AS
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
SELECT @@ROWCOUNT
GO
--13
ALTER PROC SpecificPriceIncrease
AS
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
EXEC HeavyToys 500
GO
--14
ALTER PROC HeavyToys 
@Weight int
AS
BEGIN TRY
SELECT * FROM Toys 
WHERE Netweight > @Weight
END TRY
BEGIN CATCH
SELECT  
        ERROR_NUMBER() AS ErrorNumber  
        ,ERROR_SEVERITY() AS ErrorSeverity  
        ,ERROR_STATE() AS ErrorState  
        ,ERROR_PROCEDURE() AS ErrorProcedure  
        ,ERROR_LINE() AS ErrorLine  
        ,ERROR_MESSAGE() AS ErrorMessage;  
END CATCH
GO
--
ALTER PROC QtyOnHand 
@QtyPlus int
AS
BEGIN TRY
UPDATE Toys
SET QtyOnHand = QtyOnHand - @QtyPlus
END TRY
BEGIN CATCH
SELECT  
        ERROR_NUMBER() AS ErrorNumber  
        ,ERROR_SEVERITY() AS ErrorSeverity  
        ,ERROR_STATE() AS ErrorState  
        ,ERROR_PROCEDURE() AS ErrorProcedure  
        ,ERROR_LINE() AS ErrorLine  
        ,ERROR_MESSAGE() AS ErrorMessage;  
END CATCH
GO
--
ALTER PROC PriceIncrease
@PricePlus int
AS
BEGIN TRY
UPDATE Toys
SET UnitPrice = UnitPrice + @PricePlus
END TRY
BEGIN CATCH
SELECT  
        ERROR_NUMBER() AS ErrorNumber  
        ,ERROR_SEVERITY() AS ErrorSeverity  
        ,ERROR_STATE() AS ErrorState  
        ,ERROR_PROCEDURE() AS ErrorProcedure  
        ,ERROR_LINE() AS ErrorLine  
        ,ERROR_MESSAGE() AS ErrorMessage;  
END CATCH
GO
--
ALTER PROC SpecificPriceIncrease
AS
BEGIN TRY
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
EXEC HeavyToys 500
END TRY
BEGIN CATCH
SELECT  
        ERROR_NUMBER() AS ErrorNumber  
        ,ERROR_SEVERITY() AS ErrorSeverity  
        ,ERROR_STATE() AS ErrorState  
        ,ERROR_PROCEDURE() AS ErrorProcedure  
        ,ERROR_LINE() AS ErrorLine  
        ,ERROR_MESSAGE() AS ErrorMessage;  
END CATCH
GO
--15
DROP PROC HeavyToys
DROP PROC PriceIncrease
DROP PROC QtyOnHand
DROP PROC SpecificPriceIncrease