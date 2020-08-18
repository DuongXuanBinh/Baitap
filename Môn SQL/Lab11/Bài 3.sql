CREATE DATABASE Lab11_1
USE Lab11_1
GO

CREATE TABLE Class(
ClassCode varchar(10) PRIMARY KEY,
HeadTeacher varchar(30),
Room varchar(30),
TimeSlot char,
CloseDate datetime)
GO
CREATE TABLE Student(
RollNO varchar(10) PRIMARY KEY,
ClassCode varchar(10),
FullName varchar(30),
Male bit,
BirthDate datetime,
Address varchar(30),
Province char(20),
Email varchar(30),
CONSTRAINT fk1 FOREIGN KEY (ClassCode) REFERENCES Class(ClassCode))
GO
CREATE TABLE Subject(
SubjectCode varchar(10) PRIMARY KEY,
SubjectName varchar(40),
WMark bit,
PMark bit,
WTest_per int,
PTest_per int
)
GO
CREATE TABLE Mark(
RollNo varchar(10),
SubjectCode varchar(10),
WMark float,
PMark float,
Mark float,
CONSTRAINT pr1 PRIMARY KEY (RollNo, SubjectCode),
CONSTRAINT fk2 FOREIGN KEY (RollNO) REFERENCES Student(RollNo),
CONSTRAINT fk3 FOREIGN KEY (SubjectCode) REFERENCES Subject(SubjectCode))
GO
INSERT INTO Class VALUES ('FPT1','Mr A','P207','M','2020-9-28')
INSERT INTO Class VALUES ('FPT2','Ms B','P206','I','2020-4-20')
INSERT INTO Class VALUES ('FPT3','Mrs C','P205','L','2020-2-15')
INSERT INTO Class VALUES ('FPT4','Mr D','P208','M','2020-7-7')
INSERT INTO Class VALUES ('FPT5','Ms E','P209','G','2020-8-6')
GO
INSERT INTO Student VALUES ('A23475','FPT1','Nguyen Van A','1','1995-10-11','Hoang Mai','HN','nguyenvana@gmail.com')
INSERT INTO Student VALUES ('A36276','FPT2','Nguyen Van B','0','1996-1-11','Hoang Van Thu','BG','nguyenvanb@gmail.com')
INSERT INTO Student VALUES ('A26135','FPT4','Nguyen Van C','1','1997-5-11','Ha Dong','HT','nguyenvanc@gmail.com')
INSERT INTO Student VALUES ('A94628','FPT3','Nguyen Van D','0','1998-4-2','Quan 1','SG','nguyenvand@gmail.com')
INSERT INTO Student VALUES ('A26175','FPT5','Nguyen Van E','1','1994-9-11','Do Quang','HN','nguyenvane@gmail.com')
GO
INSERT INTO Subject VALUES ('TH','Toan Hoc','0','1',2,3)
INSERT INTO Subject VALUES ('VH','Van Hoc','1','0',1,3)
INSERT INTO Subject VALUES ('DL','Dia Ly','1','1',2,2)
INSERT INTO Subject VALUES ('SH','Sinh Hoc','0','1',3,3)
INSERT INTO Subject VALUES ('EN','Tieng Anh','1','1',1,1)
GO
INSERT INTO Mark VALUES ('A23475','VH',7.5,NULL,7.5)
INSERT INTO Mark VALUES ('A23475','TH',NULL,9,9)
INSERT INTO Mark VALUES ('A26175','SH',NULL,10,10)
INSERT INTO Mark VALUES ('A26135','EN',7.5,8.5,8)
INSERT INTO Mark VALUES ('A36276','DL',6,7,6.5)
INSERT INTO Mark VALUES ('A94628','TH',NULL,7,7)
INSERT INTO Mark VALUES ('A94628','VH',3,NULL,3)
INSERT INTO Mark VALUES ('A26135','DL',3,8.5,5.75)
GO
--1
CREATE TRIGGER BEFORE_SUBJECT_INSERT
ON Subject
FOR INSERT
AS
BEGIN
	IF EXISTS(SELECT SubjectName FROM inserted WHERE SubjectName IN (SELECT SubjectName FROM Subject))
	BEGIN
		PRINT 'TRUNG SUBJECT'
		ROLLBACK TRAN
	END
END
GO
--2
CREATE TRIGGER BEFORE_STUDENT_UPDATE
ON Student
FOR UPDATE
AS
BEGIN
	IF EXISTS(SELECT Province FROM inserted WHERE LEN(Province)!=2)
	BEGIN
	PRINT 'KHONG DUOC UPDATE'
	ROLLBACK TRAN
	END
END
GO
--3
CREATE TRIGGER BEFORE_CLASS_INSERT
ON Class
FOR INSERT
AS
BEGIN
	IF EXISTS (SELECT TimeSlot FROM inserted WHERE TimeSlot NOT LIKE '[GIML]')
		BEGIN
			PRINT 'Valid'
			ROLLBACK TRAN
		END
END
GO
--4
CREATE TRIGGER AFTER_SUBJECT_DELETE
ON Subject
FOR DELETE
AS
BEGIN
	 DELETE FROM Mark WHERE SubjectCode IN (SELECT SubjectCode FROM deleted)
END
GO
--5
CREATE TRIGGER AFTER_CLASS_DELETE
ON Class
FOR DELETE
AS
BEGIN
	IF EXISTS (SELECT * FROM Mark WHERE RollNo IN (SELECT RollNo FROM Student WHERE ClassCode IN (SELECT ClassCode FROM deleted)))
	BEGIN
		PRINT 'INVALID'
		ROLLBACK TRAN
	END
	ELSE
		DELETE FROM Student WHERE ClassCode IN (SELECT ClassCode FROM deleted)
END
GO
--6
CREATE TRIGGER AFTER_SUBJECT_DELETE1
ON Subject
FOR DELETE
AS
BEGIN
	DECLARE @number int
	SELECT @number=COUNT(RollNo) FROM Mark GROUP BY SubjectCode

	IF(@number>5)
		ROLLBACK TRAN
	ELSE IF(@number<=5)
		BEGIN
		IF EXISTS (SELECT * FROM Mark WHERE SubjectCode IN (SELECT SubjectCode FROM deleted))
			BEGIN
				PRINT 'Invalid'
				ROLLBACK TRAN
			END
		END
END
GO
