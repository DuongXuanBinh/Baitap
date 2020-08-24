--1
CREATE DATABASE MyBlog
USE MyBlog
GO
DROP DATABASE MyBlog
--2
CREATE TABLE Users(
UserID int PRIMARY KEY IDENTITY (1,1),
UserName varchar(20),
Password varchar(30),
Email varchar(30) UNIQUE,
Address nvarchar(200))
GO
CREATE TABLE Posts(
PostID int PRIMARY KEY IDENTITY(111,10),
Title nvarchar(200),
Content nvarchar,
Tag nvarchar(100),
Status Bit,
CreateTime datetime DEFAULT(GETDATE()),
UpdateTime datetime,
UserID int
CONSTRAINT fk1 FOREIGN KEY (UserID) REFERENCES Users(UserID))
GO
CREATE TABLE Comments(
CommentID int IDENTITY(100,100),
Content nvarchar(500),
Status bit,
CreateTime datetime DEFAULT(GETDATE()),
Author nvarchar(30),
Email varchar(50) NOT NULL,
PostID int,
CONSTRAINT fk2 FOREIGN KEY (PostID) REFERENCES Posts(PostID))
GO
--3
ALTER TABLE Users
ADD CONSTRAINT ch1 CHECK (Email LIKE '%@%')
GO
ALTER TABLE Comments
ADD CONSTRAINT ch2 CHECK (Email LIKE '%@%')
GO
--4
CREATE UNIQUE NONCLUSTERED INDEX IX_Username ON Users(UserName)
GO
--5
INSERT INTO Users VALUES ('Nguyen Van A','NguyenVanA','NguyenVanA@gmail.com','Ha Noi')
INSERT INTO Users VALUES ('Nguyen Van B','NguyenVanB','NguyenVanB@gmail.com','Bac Ninh')
INSERT INTO Users VALUES ('Nguyen Van C','NguyenVanC','NguyenVanC@gmail.com','Bac Giang')
GO
INSERT INTO Posts VALUES ('Homo Sapiens','A','Homo','1','2016-5-12','2020-4-23',1)
INSERT INTO Posts VALUES ('Harry Porter','B','Harry','1','2018-2-22','2018-4-23',2)
INSERT INTO Posts VALUES ('Santa Clause','C','Santa','0','2014-8-5','2019-5-2',3)
GO
INSERT INTO Comments VALUES ('kjasfhjksahfkha','1','2020-4-29','Good','Author1@gmail.com',121)
INSERT INTO Comments VALUES ('kjujahkjavhjkasfllkiasopfi','1','2020-5-9','Best','Author2@gmail.com',111)
INSERT INTO Comments VALUES ('iauyfiyfuiwqykjhvdsjkvhsdhf','0','2020-3-2','Bad','Author3@gmail.com',131)
GO
--6
SELECT * FROM Posts
WHERE Tag = 'Harry'
GO
--7
SELECT Posts.PostID, Title, Posts.Content, Tag, Posts.Status, Posts.CreateTime, UpdateTime, UserID FROM Posts
JOIN Comments ON Comments.PostID=Posts.PostID
WHERE Email = 'Author3@gmail.com'
GO
--8
SELECT Posts.PostID, Title, COUNT(CommentID) AS NumberOfComments FROM Comments
JOIN Posts ON Posts.PostID = Comments.PostID
GROUP BY Posts.PostID,Title
GO
--9
CREATE VIEW v_NewPost 
AS
SELECT TOP(2) Title, UserName, CreateTime FROM Posts
JOIN Users ON Users.UserID=Posts.UserID
ORDER BY CreateTime DESC
GO
--10
CREATE PROCEDURE sp_GetComment
@InputPostID int
AS
SELECT CommentID,Content FROM Comments
WHERE PostID = @InputPostID
GO
--11
CREATE TRIGGER tg_UpdateTime
ON Posts
FOR UPDATE
AS
BEGIN
UPDATE Posts
SET UpdateTime = Getdate()
WHERE PostID IN (SELECT PostID FROM deleted)
END
GO