CREATE DATABASE Lab12
USE Lab12
GO
CREATE TABLE Employee(
EmployeeID int,
Name varchar(100),
Tel char(11),
Email varchar(30))
GO
CREATE TABLE Groupp(
GroupID int,
GroupName varchar(30),
LeaderID int,
ProjectID int)
GO
CREATE TABLE Project(
ProjectID int,
ProjectName varchar(30),
StartDate datetime,
EndDate datetime,
Period int,
Cost money)
GO
CREATE TABLE GroupDetail(
GroupID int,
EmployeeID int,
Status char(20))
GO
--1
ALTER TABLE Employee
ALTER COLUMN EmployeeID int NOT NULL
ALTER TABLE Employee
ADD CONSTRAINT pk1 PRIMARY KEY(EmployeeID)
GO
ALTER TABLE Groupp
ALTER COLUMN GroupID int NOT NULL
ALTER TABLE Groupp
ADD CONSTRAINT pk2 PRIMARY KEY (GroupID)
ALTER TABLE Groupp
ADD CONSTRAINT fk1 FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID)
ALTER TABLE Groupp
ADD CONSTRAINT fk4 FOREIGN KEY (LeaderID) REFERENCES Employee(EmployeeID)
GO
ALTER TABLE Project
ALTER COLUMN ProjectID int NOT NULL
ALTER TABLE Project
ADD CONSTRAINT pk3 PRIMARY KEY (ProjectID)
GO
ALTER TABLE GroupDetail
ADD CONSTRAINT fk2 FOREIGN KEY (GroupID) REFERENCES Groupp(GroupID)
ALTER TABLE GroupDetail
ADD CONSTRAINT fk3 FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
GO
--2
INSERT INTO Employee VALUES (101,'Nguyen Van A','84729372913','xuanbinh1011@gmail.com')
INSERT INTO Employee VALUES (102,'Nguyen Van B','74832749281','xuanbinh1012@gmail.com')
INSERT INTO Employee VALUES (103,'Nguyen Thi C','74837201928','xuanbinh1013@gmail.com')
INSERT INTO Employee VALUES (104,'Nguyen Thi D','75648365729','xuanbinh1014@gmail.com')
INSERT INTO Employee VALUES (105,'Nguyen Van A','01672925631','xuanbinh1015@gmail.com')
GO
INSERT INTO Groupp VALUES  (1011,'Nhom A',101,11)
INSERT INTO Groupp VALUES  (1012,'Nhom B',101,12)
INSERT INTO Groupp VALUES  (1013,'Nhom C',102,11)
INSERT INTO Groupp VALUES  (1014,'Nhom D',103,13)
INSERT INTO Groupp VALUES  (1015,'Nhom E',103,14)
INSERT INTO Groupp VALUES  (1016,'Nhom F',105,15)
GO
INSERT INTO Project VALUES (11,'Du an A','2020-8-19','2020-10-20',3,100.000)
INSERT INTO Project VALUES (12,'Du an B','2020-7-15','2020-11-15',4,150.000)
INSERT INTO Project VALUES (13,'Du an C','2020-8-19','2020-9-20',1,200.000)
INSERT INTO Project VALUES (14,'Du an D','2020-6-19','2020-10-23',4,180.000)
INSERT INTO Project VALUES (15,'Du an E','2020-1-19','2020-10-12',9,300.000)
GO
INSERT INTO GroupDetail VALUES (1011,101,'dang lam')
INSERT INTO GroupDetail VALUES (1011,102,'dang lam')
INSERT INTO GroupDetail VALUES (1012,101,'da lam')
INSERT INTO GroupDetail VALUES (1012,104,'da lam')
INSERT INTO GroupDetail VALUES (1012,105,'da lam')
INSERT INTO GroupDetail VALUES (1013,102,'dang lam')
INSERT INTO GroupDetail VALUES (1014,103,'sap lam')
INSERT INTO GroupDetail VALUES (1015,103,'dang lam')
INSERT INTO GroupDetail VALUES (1016,105,'sap lam')
INSERT INTO GroupDetail VALUES (1016,104,'sap lam')
GO
--3
SELECT * FROM Employee
GO
SELECT ProjectID, EmployeeID FROM Groupp
JOIN GroupDetail ON GroupDetail.GroupID=Groupp.GroupID
WHERE ProjectID = 11
GO
SELECT GroupID, COUNT(EmployeeID) as SoNVMoiNhom FROM GroupDetail
GROUP BY GroupID
GO
SELECT * FROM Employee 
WHERE EmployeeID IN (SELECT DISTINCT LeaderID FROM Groupp)
GO
SELECT Groupp.ProjectID, Groupp.GroupID, EmployeeID FROM GroupDetail
JOIN Groupp ON Groupp.GroupID = GroupDetail.GroupID
JOIN Project ON Project.ProjectID=Groupp.ProjectID
WHERE StartDate > '2020-7-10'
ORDER BY ProjectID, GroupID
GO
SELECT * FROM Employee WHERE EmployeeID IN (SELECT EmployeeID FROM GroupDetail)
GO
SELECT *  FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
JOIN Groupp ON GroupDetail.GroupID=Groupp.GroupID
JOIN Project ON Project.ProjectID=Groupp.ProjectID
WHERE GroupDetail.Status='da lam'
GO
--4
ALTER TABLE Project
ADD CONSTRAINT ch1 CHECK (StartDate < EndDate)
GO
ALTER TABLE Employee
ADD CONSTRAINT ch2 CHECK (Name IS NOT NULL)
GO
ALTER TABLE GroupDetail
ADD CONSTRAINT ch3 CHECK (Status IN ('da lam','dang lam','sap lam'))
GO
ALTER TABLE Project
ADD CONSTRAINT ch4 CHECK (Cost > 1.000)
GO
ALTER TABLE Employee
ADD CONSTRAINT ch5 CHECK (Tel = '0[0-9]')
GO
--5
CREATE PROC TangGia
AS
UPDATE Project
SET Cost = Cost + Cost * 10 / 100
WHERE Cost < 150.000
GO
CREATE PROC DuAnSapTH
AS
SELECT * FROM Project
WHERE StartDate > GETDATE()
GO
CREATE PROC DuAnDaHT
AS
SELECT * FROM Project
WHERE EndDate < GETDATE()
GO
--6
CREATE UNIQUE INDEX IX_Group ON GroupDetail(GroupID, EmployeeID)
GO
CREATE INDEX IX_Project ON Project(ProjectName, StartDate, EndDate)
GO
--7
CREATE VIEW View1 AS
SELECT Name, Tel, Email, GroupName, ProjectName FROM Employee
JOIN GroupDetail ON GroupDetail.EmployeeID=Employee.EmployeeID
JOIN Groupp ON Groupp.GroupID=GroupDetail.GroupID
JOIN Project ON Groupp.ProjectID=Project.ProjectID
WHERE Project.EndDate > GETDATE()
GO
CREATE VIEW View2 AS
SELECT Name, GroupName, ProjectName, Status FROM Employee
JOIN GroupDetail ON GroupDetail.EmployeeID=Employee.EmployeeID
JOIN Groupp ON Groupp.GroupID=GroupDetail.GroupID
JOIN Project ON Groupp.ProjectID=Project.ProjectID
GO
--8
CREATE TRIGGER AFTER_PROJECT_UPDATE
ON Project
FOR UPDATE
AS
BEGIN
	IF EXISTS (SELECT EndDate FROM inserted WHERE EndDate >= StartDate)
		BEGIN
		DECLARE @Date datetime
		SELECT @Date=EndDate FROM inserted
		UPDATE Project 
		SET Period = DATEDIFF(month,StartDate,@Date)
		END
	ELSE
		BEGIN
		PRINT 'INVALID ENDDATE'
		ROLLBACK TRAN
		END
END
GO
CREATE TRIGGER AFTER_GROUP_DELETE
ON Groupp
FOR DELETE
AS
BEGIN
	DELETE FROM GroupDetail WHERE GroupID IN (SELECT GroupID FROM deleted)
END
GO
CREATE TRIGGER BEFORE_GROUP_INSERT
ON Groupp
FOR INSERT
AS
BEGIN
	IF EXISTS(SELECT GroupName FROM inserted WHERE GroupName IN (SELECT GroupName FROM Groupp))
	BEGIN
		PRINT 'TRUNG TEN'
		ROLLBACK TRAN
	END
END
GO
