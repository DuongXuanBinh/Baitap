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
	CONSTRAINT pk1 PRIMARY KEY (BookCode)
	)
GO
CREATE TABLE Member(
	MemberCode int,
	Name varchar(50) NOT NULL,
	Address varchar(100) NOT NULL,
	PhoneNumber bigint,
	CONSTRAINT pk2 PRIMARY KEY (MemberCode)
	)
GO
CREATE TABLE IssueDetails(
	BookCode int ,
	MemberCode int,
	IssueDate datetime,
	ReturnDate datetime,
	CONSTRAINT pk3 foreign key (BookCode) references Book(BookCode),
	CONSTRAINT pk4 foreign key (MemberCode) references Member(MemberCode),
	)
GO

ALTER TABLE IssueDetails DROP CONSTRAINT pk3
ALTER TABLE IssueDetails DROP CONSTRAINT pk4
GO

ALTER TABLE Book DROP CONSTRAINT pk1
ALTER TABLE Member DROP CONSTRAINT pk2
GO

ALTER TABLE Member 
	ADD CONSTRAINT pk1 PRIMARY KEY (BookCode)
ALTER TABLE Book
	ADD CONSTRAINT pk2 PRIMARY KEY (MemberCode)
GO

ALTER TABLE IssueDetails ADD CONSTRAINT pk3 FOREIGN KEY (BookCode) REFERENCES Book(BookCode)
ALTER TABLE IssueDetails ADD CONSTRAINT pk4 FOREIGN KEY (MemberCode) REFERENCES Member(MemberCode)
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

