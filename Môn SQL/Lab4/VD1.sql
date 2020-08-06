IF EXISTS (SELECT * FROM sys.databases 
where Name =	 'Example5'
	DROP DATABASE Example5
GO
CREATE DATABASE Example5
GO
USE Example5
GO
CREATE TABLE LopHoc(
	MaLopHoc int primary key identity,
	TenLopHoc varchar(10))
Go
CREATE TABLE SinhVien(
	MaSV int Primary key,
	TenSV varchar(40),
	MaLopHoc int,
	Constraint fk foreign key (MaLopHoc) References Lophoc(MaLopHoc)
	)
GO
CREATE TABLE SanPham(
	MaSP int NOT NULL,
	TenSP varchar(40) NULL
	)
GO

Create Table StoreProduct(
	ProductID int NOT NULL,
	Name varchar(40) NOT NULL,
	Price money NOT NULL DEFAULT(100)
	)
GO
INSERT INTO StoreProduct (ProductID,Name) VALUES (111, 'Rivets')
GO

CREATE TABLE ContactPhone(
	Person_ID int IDENTITY(500,1) NOT NULL,
	MobileNumber bigint NOT NULL
	)
GO
CREATE TABLE CellularPhone(
	Person_ID uniqueidentifier DEFAULT NEWID() NOT NULL,
	PersonName varchar(60) NOT NULL
	)
GO
INSERT INTO CellularPhone(PersonName) VALUES ('William Smith')
GO
SELECT * FROM CellularPhone
GO
CREATE TABLE ContactPhone(
	Person_ID int Primary key,
	MobileNumber bigint UNIQUE,
	ServiceProvider varchar(30),
	LandlineNumber bigint UNIQUE
	)
GO
INSERT INTO ContactPhone VALUES(101,89789,'Hutch',NULL)
INSERT INTO ContactPhone VALUES(102,89789,'Alex',NULL)
GO
CREATE TABLE PhoneExpenses(
	Expense_ID int primary key,
	MobileNumber bigint foreign key References ContactPhone(MobileNumber),
	Amount bigint CHECK (Amount > 0)
	)
GO
ALTER TABLE ContactPhone
	ALTER COLUMN ServiceProvider varchar(45)
GO
ALTER TABLE ContactPhone
	DROP COLUMN ServiceProvider
GO
ALTER TABLE ContactPhone ADD CONSTRAINT CHK_RC CHECK(RentalCharges > 0)
GO
ALTER TABLE ContactPhone
	DROP CONSTRAINT CHK_RC