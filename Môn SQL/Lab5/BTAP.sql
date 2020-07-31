CREATE DATABASE BookLibraby
GO

USE BookLibraby
GO

CREATE TABLE Book(
	BookCode int,
	BookTitle varchar(100) NOT NULL,
	Author varchar(50) NOT NULL,
	Edition int,
	BookPrice money,
	Copies int,
	CONSTRAINT pk1 PRIMARY KEY(BookCode)
	)
GO
INSERT INTO Book VALUES (1,'Titile1', 'Author1', 2019, 10, 3)
INSERT INTO Book VALUES (2,'Titile2', 'Author2', 2019, 20, 4)
GO
CREATE TABLE Member(
	MemberCode int,
	Name varchar(50) NOT NULL,
	Address varchar(100) NOT NULL,
	PhoneNumber bigint,
	CONSTRAINT pk2 PRIMARY KEY (MemberCode)
	)
GO
INSERT INTO Member VALUES (1001,'John','NewYork',098213091)
INSERT INTO Member VALUES (1002,'Jackie','NewYork',012343441)
GO

CREATE TABLE IssueDetails(
	BookCode int ,
	MemberCode int,
	IssueDate datetime,
	ReturnDate datetime,
	CONSTRAINT fk3 foreign key (BookCode) references Book(BookCode),
	CONSTRAINT fk4 foreign key (MemberCode) references Member(MemberCode)
	)
GO
INSERT INTO IssueDetails VALUES(1,1001,12-8-2020,23-8-2020)
GO
ALTER TABLE IssueDetails DROP CONSTRAINT fk3
ALTER TABLE IssueDetails DROP CONSTRAINT fk4
GO

ALTER TABLE Book DROP CONSTRAINT pk1
ALTER TABLE Member DROP CONSTRAINT pk2
GO

ALTER TABLE Book 
	ADD CONSTRAINT pk1 PRIMARY KEY (BookCode)
ALTER TABLE Member
	ADD CONSTRAINT pk2 PRIMARY KEY (MemberCode)
GO

ALTER TABLE IssueDetails ADD CONSTRAINT fk3 FOREIGN KEY (BookCode) REFERENCES Book(BookCode)
ALTER TABLE IssueDetails ADD CONSTRAINT fk4 FOREIGN KEY (MemberCode) REFERENCES Member(MemberCode)
GO

ALTER TABLE Book
	ADD CHECK (BookPrice > 0 AND BookPrice < 200)
GO

ALTER TABLE Member
	ADD UNIQUE(PhoneNumber)
GO

ALTER TABLE IssueDetails
	ALTER COLUMN BookCode int NOT NULL
ALTER TABLE IssueDetails
	ALTER COLUMN MemberCode int NOT NULL
GO

ALTER TABLE IssueDetails
	ADD PRIMARY KEY(BookCode, MemberCode)
GO
SELECT * FROM Book
SELECT * FROM Member
SELECT * FROM IssueDetails





