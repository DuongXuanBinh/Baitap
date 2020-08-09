CREATE DATABASE Lab8
USE Lab8

CREATE TABLE Student(
StudentNo int PRIMARY KEY,
StudentName varchar(50),
StudentAddress varchar(100),
PhoneNo int)
GO
CREATE TABLE Department(
DeptNo int PRIMARY KEY,
DeptName varchar(50),
ManagerName char(30))
GO
CREATE TABLE Assignment(
AssignmentNo int PRIMARY KEY,
Description varchar(100))
GO
CREATE TABLE Works_Assign(
JobID int PRIMARY KEY,
StudentNo int,
AssignmentNo int,
TotalHours int,
JobDetails XML,
CONSTRAINT fk1 FOREIGN KEY (StudentNo) REFERENCES Student(StudentNo),
CONSTRAINT fk2 FOREIGN KEY (AssignmentNo) REFERENCES Assignment(AssignmentNo))
GO
ALTER TABLE Works_Assign
DROP CONSTRAINT fk1, fk2
ALTER TABLE [dbo].[Student]
DROP constraint [PK__Student__32C4C02A5119C4C2]
CREATE CLUSTERED INDEX IX_Student ON Student(StudentNo)
WITH (DROP_EXISTING = ON)
execute sp_helpindex Student


ALTER INDEX IX_Student ON Student DISABLE

CREATE NONCLUSTERED INDEX IX_Dept ON Department(DeptNo,DeptName,ManagerName)