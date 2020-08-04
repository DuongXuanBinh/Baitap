CREATE DATABASE Lab6
USE Lab6

CREATE TABLE PhongBan(
	MaPB varchar(7) PRIMARY KEY,
	TenPB nvarchar(50))
GO
CREATE TABLE NhanVien(
	MaNV varchar(7) PRIMARY KEY,
	TenNV nvarchar(50),
	NgaySinh datetime check (getdate()>NgaySinh),
	SoCMND char(9) check (SoCMND Like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'),
	GioiTinh char(1) check(GioiTinh like '[M|F]') default('M'),
	DiaChi nvarchar (100),
	NgayVaoLam datetime,
	MaPB varchar(7) foreign key references PhongBan(MaPB),
	CONSTRAINT sotuoi CHECK(datediff(year,NgaySinh,NgayVaoLam)>20))
GO

CREATE TABLE LuongDA(
	MaDA varchar(8),
	MaNV varchar(7),
	NgayNhan datetime not null default(getdate()),
	SoTien money check (SoTien > 0),
	CONSTRAINT pk PRIMARY KEY (MaDA,MaNV),
	CONSTRAINT fk1 FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV))
GO
--1
INSERT INTO PhongBan VALUES ('KD','Kinh Doanh')
INSERT INTO PhongBan VALUES ('HR','Nhan Su')
INSERT INTO PhongBan VALUES ('MRT','Marketing')
INSERT INTO PhongBan VALUES ('TH','Tong Hop')
INSERT INTO PhongBan VALUES ('KT','Ke Toan')
GO
INSERT INTO NhanVien VALUES ('A1','Nguyen Van A','1991-9-23','123456789','M','Ha Noi','2019-10-10','HR')
INSERT INTO NhanVien VALUES ('A3','Nguyen Van B','1995-10-23','125432765','M','Bac Giang','2020-8-1','KD')
INSERT INTO NhanVien VALUES ('A4','Nguyen Van C','1996-3-14','758395617','M','Bac Ninh','2019-5-20','MRT')
INSERT INTO NhanVien VALUES ('A5','Nguyen Van D','1993-3-23','546352098','F','Hai Phong','2018-11-10','KT')
INSERT INTO NhanVien VALUES ('A6','Nguyen Van E','1997-12-19','636291054','F','Sai Gon','2020-4-11','TH')
INSERT INTO NhanVien VALUES ('A7','Nguyen Van F','1994-12-19','636291054','F','Sai Gon','2019-4-11','TH')
GO
INSERT INTO LuongDA VALUES ('DA1','A5','2020-8-1',20000)
INSERT INTO LuongDA VALUES ('DA2','A4','2020-7-1',30000)
INSERT INTO LuongDA VALUES ('DA3','A6','2020-6-1',40000)
INSERT INTO LuongDA VALUES ('DA4','A1','2020-5-1',50000)
INSERT INTO LuongDA VALUES ('DA5','A3','2020-4-1',60000)
INSERT INTO LuongDA VALUES ('DA6','A3','2020-1-1',10000)
INSERT INTO LuongDA VALUES ('DA6','A5','2020-2-1',20000)
INSERT INTO LuongDA VALUES ('DA6','A7','2020-2-1',20000)

GO
--2
SELECT * FROM PhongBan
GO
SELECT * FROM NhanVien
GO
SELECT * FROM LuongDA
GO
--3
SELECT MaNV,GioiTinh FROM NhanVien
WHERE GioiTinh = 'F'
GO
--4
SELECT MaDA FROM LuongDA
GO
--5
SELECT MaNV, SUM(SoTien) as TongLuong  FROM LuongDA
GROUP BY MaNV
GO
--6
SELECT MaNV, TenNV FROM NhanVien
WHERE MaPB='TH'
GO
--7
SELECT  a.MaNV, SoTien FROM LuongDA as a
	INNER JOIN NhanVien as b
	ON a.MaNV=b.MaNV
WHERE MaPB='TH'
GO
--8
SELECT TenPB, COUNT (*) as SoNV FROM NhanVien
INNER JOIN PhongBan ON NhanVien.MaPB=PhongBan.MaPB
GROUP BY TenPB
GO
--9
SELECT MaNV, COUNT(MaDA) as SoDA FROM LuongDA
GROUP BY MaNV
HAVING COUNT(MaDA) >=1
GO
--10
SELECT TOP(1) TenPB, COUNT(MaNV) as SoNV FROM NhanVien
INNER JOIN PhongBan ON NhanVien.MaPB=PhongBan.MaPB
GROUP BY TenPB
ORDER BY COUNT(MaNV) DESC
GO
--11
SELECT TenPB, COUNT(MaNV) as SoNV FROM NhanVien
INNER JOIN PhongBan ON NhanVien.MaPB=PhongBan.MaPB
WHERE TenPB='Tong Hop'
GROUP BY TenPB
GO
--12
SELECT a.MaNV, SoTien FROM NhanVien as a
INNER JOIN LuongDA as b
ON a.MaNV=b.MaNV
WHERE a.SoCMND LIKE '%9'
GO
--13
SELECT TOP(1) MaNV, SUM(SoTien) FROM LuongDA
GROUP BY MaNV
ORDER BY SUM(SoTien) DESC
GO
--14
SELECT a.MaNV, GioiTinh, SoTien FROM NhanVien as a
INNER JOIN LuongDA as b
ON a.MaNV = b.MaNV
WHERE a.GioiTinh = 'F' AND b.SoTien > 10000
GO
--15
SELECT TenPB, SUM(SoTien) as TongLuong FROM  NhanVien
INNER JOIN PhongBan ON NhanVien.MaPB=PhongBan.MaPB
INNER JOIN LuongDA
ON NhanVien.MaNV=LuongDA.MaNV
GROUP BY TenPB
GO
--16
SELECT MaDA, COUNT(MaNV) as SoNV FROM LuongDA
GROUP BY MaDA
HAVING COUNT(MaNV)>=2
GO
--17
SELECT * FROM NhanVien
WHERE TenNV LIKE 'N%'
GO
--18
SELECT NhanVien.MaNV, TenNV FROM NhanVien
INNER JOIN LuongDA
ON NhanVien.MaNV=LuongDA.MaNV
WHERE DATEPART(year,NgayNhan) = 2003
GO
--19
SELECT * FROM NhanVien
WHERE EXISTS (SELECT MaNV,COUNT(MaDA) FROM LuongDA
GROUP BY MaNV
HAVING COUNT(MaDA)=0)
GO
--20
DELETE FROM LuongDA
WHERE MaDA='DA1'
GO
--21
DELETE FROM LuongDA
WHERE SoTien > 50000
GO
--22
UPDATE LuongDA
SET SoTien = SoTien * 0.1
WHERE MaDA = 'DA2'
GO
--23
DELETE FROM NhanVien
WHERE NOT EXISTS (SELECT MaNV FROM LuongDA WHERE LuongDA.MaNV = NhanVien.MaNV)
GO
--24
UPDATE NhanVien
SET NgayVaoLam = '2019-02-12'
WHERE MaPB='TH'
GO
