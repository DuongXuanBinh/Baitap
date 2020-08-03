CREATE DATABASE Example1
USE Example1
CREATE TABLE Student(
	MaSV int primary key,
	HovaTen varchar(50) NOT NULL,
	NamSinh date,
	GioiTinh varchar(5),
	Startdate date,
	Enddate date null)
GO

CREATE TABLE Class(
	MaLop int primary key,
	TenLop varchar(20),
	Startdate date,
	Enddate date,
	Status int,--0=chuahoc, 1=danghoc, 2=dahoc
	)
GO
CREATE TABLE ClassDetail(
	MaSV int,
	MaLop int,
	Status int,--0=Chuamo, 1=Damo, 2=DaDong
	CONSTRAINT fk1 FOREIGN KEY (MaSV) REFERENCES Student(MaSV),
	CONSTRAINT fk2 FOREIGN KEY (MaLop) REFERENCES Class(MaLop))
GO

INSERT INTO Student VALUES (01,'Dark','1995-11-10','Nam','2017-8-9',null)
INSERT INTO Student VALUES (02,'White','1996-05-13','Nam','2018-10-9',null)
INSERT INTO Student VALUES (03,'Blue','1997-11-10','Nam','2016-8-9','2019-6-5')
INSERT INTO Student VALUES (04,'Black','1998-05-13','Nam','2019-10-9',null)
INSERT INTO Student VALUES (05,'Green','1979-11-10','Nam','2015-8-9','2020-6-5')
GO
UPDATE Student SET GioiTinh = 'Nu' WHERE MaSV=03
GO
DELETE FROM Student WHERE MaSV=05
GO


INSERT INTO Class VALUES (111,'C','2020-4-10','2020-5-10',0)
INSERT INTO Class VALUES (112,'HTML','2020-5-10','2020-6-10',1)
INSERT INTO Class VALUES (113,'CSS','2020-6-10','2020-7-10',0)
INSERT INTO Class VALUES (114,'JS','2020-7-10','2020-8-10',1)
INSERT INTO Class VALUES (115,'SQL','2020-8-10','2020-9-10',2)
GO
UPDATE Class SET Enddate = '2020-9-20' WHERE MaLop=115
GO
DELETE FROM Class WHERE MaLop=114
GO

INSERT INTO ClassDetail VALUES (01,111,0)
INSERT INTO ClassDetail VALUES (01,112,1)
INSERT INTO ClassDetail VALUES (02,115,2)
INSERT INTO ClassDetail VALUES (05,114,0)
INSERT INTO ClassDetail VALUES (03,113,1)
GO
UPDATE ClassDetail SET Status = 2 WHERE MaSV=01 AND MaLop = 111
GO
DELETE FROM ClassDetail WHERE MaLop=114
GO