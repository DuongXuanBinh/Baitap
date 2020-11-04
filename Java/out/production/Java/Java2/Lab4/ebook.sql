drop database ebookstore;
create database if not exists ebookstore;
use ebookstore;
create table category(
    genre int PRIMARY KEY,
    nameCate varchar(50)
);
create table books(
    bookID int,
    title varchar(50),
    author varchar(50),
    years date,
    genre int,
    status int check (status REGEXP '[1-3]{1}'),
    qty int,
    price decimal(10,1),
    createddate date,
    updateddate date,
    CONSTRAINT pk_books PRIMARY KEY(bookID,title),
    CONSTRAINT fk_category FOREIGN KEY (genre) REFERENCES category(genre)
    );
create table customers(
    customerID int PRIMARY KEY,
    name varchar(50),
    address varchar(50),
    email varchar(50),
    phone varchar(10) check (phone REGEXP '[0-9]{10}'),
    member int check (member REGEXP '[1-4]{1}'),
    createddate datetime,
    updateddate datetime
    );

create table orders(
    orderID int PRIMARY KEY,
    customerID int,
    discount int,
    total decimal(10,1),
    orderdate date,
    status int check (status REGEXP '[0-5]{1}'),
    createddate date,
    updateddate date,
    CONSTRAINT fk_customer FOREIGN KEY (customerID) REFERENCES customers(customerID)
    );

create table orderdetail(
    orderID int,
    bookID int,
    title varchar(50),
    amount int,
    price decimal(10,1),
    createddate date,
    updateddate date,
    CONSTRAINT fk_detail FOREIGN KEY (bookID, title) REFERENCES books(bookID,title),
    CONSTRAINT fk_detail2 FOREIGN KEY (orderID) REFERENCES orders(orderID)
);

insert into category values
(1,'Fiction'),
(2,'Science'),
(3,'Literature');

insert into books(bookid, title, author, years, genre, status, qty, price, createddate)values
(111,"Doi gio hu","Nguyen Van A",2019,1,2,34,23.4,"2020-11-02"),
(222,"Homo","Nguyen Thi C",2018,2,2,34,14.9,"2020-11-02"),
(333,"21 bai hoc","Hoang Quang A",2020,2,2,17,17.6,"2020-11-02"),
(444,"Hoa vang","Nguyen Van A",2015,1,2,11,22.7,"2020-11-02"),
(555,"Biet hai long","Nguyen Tien D",2015,3,2,15,31.2,"2020-11-02"),
(666,"Thuat quan tri","Dao Van G",2019,1,2,9,18.5,"2020-11-02"),
(777,"Become","Trinh thi F",2017,3,2,11,19.2,"2020-11-02"),
(888,"Nhan qua","Dao Van G",2018,1,2,54,33.3,"2020-11-02"),
(999,"Khong gia dinh","Nguyen Van A",2019,1,2,29,37.4,"2020-11-02"),
(122,"Japanese","Hoang Quang A",2020,3,2,21,18.9,"2020-11-02"),
(133,"English","Le Thi P",2014,2,2,5,15.4,"2020-11-02"),
(144,"Python","Nguyen Thi C",2017,1,2,14,27.4,"2020-11-02"),
(155,"Don gian","Le Thi P",2016,2,2,12,15.6,"2020-11-02"),
(166,"Tieng het","Nguyen Tien D",2013,3,2,24,10.2,"2020-11-02"),
(177,"Nhat ky","Tran Van A",2014,1,2,27,20.2,"2020-11-02");

insert into customers(customerID, name, address, email, phone, member, createddate) values
(1001,"Duong Xuan Binh","Kim Giang","nguyenvana@gmail.com","0947329283",2,"2020-11-02"),
(1002,"Nguyen Tien Dat","Van Phuc","nguyenvana@gmail.com","0947329283",3,"2020-11-02"),
(1003,"Duong Thuy Ngan","Bac Giang","nguyenvana@gmail.com","0947329283",4,"2020-11-02"),
(1004,"Nguyan Van Hoang","Thai Nguyn","nguyenvana@gmail.com","0947329283",1,"2020-11-02"),
(1005,"Hoang Tien Dung","Kim Giang","nguyenvana@gmail.com","0947329283",2,"2020-11-02"),
(1006,"Nguyen Thi Quynh","Kim Giang","nguyenvana@gmail.com","0947329283",3,"2020-11-02"),
(1007,"Nguyen Ngoc Tram","Gia Lam","nguyenvana@gmail.com","0947329283",4,"2020-11-02"),
(1008,"Duong Xuan Ba","Bac Giang","nguyenvana@gmail.com","0947329283",3,"2020-11-02"),
(1009,"Nguyen Thi Hang","Ha Noi","nguyenvana@gmail.com","0947329283",2,"2020-11-02"),
(1010,"Ho Quang Huy","Thanh Tri","nguyenvana@gmail.com","0947329283",1,"2020-11-02"),
(1011,"Nguyen Thai Son","Van Phuc","nguyenvana@gmail.com","0947329283",2,"2020-11-02");

insert into orders(orderID, customerID, discount, total, orderdate, status,createddate) values
(5001,1001,0,20.2,"2020-10-29",0,"2020-11-02"),
(5003,1004,0,123.1,"2020-10-30",4,"2020-11-02"),
(5004,1003,0,71.0,"2020-6-15",3,"2020-11-02"),
(5005,1001,0,14.9,"2020-7-21",2,"2020-11-02"),
(5006,1011,0,37.6,"2020-10-15",5,"2020-11-02"),
(5007,1002,0,78.7,"2020-9-19",1,"2020-11-02"),
(5008,1005,0,15.4,"2020-9-9",5,"2020-11-02"),
(5009,1006,0,17.6,"2020-7-28",4,"2020-11-02"),
(50010,1007,0,14.9,"2020-8-30",2,"2020-11-02"),
(50011,1008,0,66.6,"2020-5-13",3,"2020-11-02"),
(5002,1010,0,97.4,"2020-11-10",1,"2020-11-02");

insert into orderdetail(orderID, bookID, title, amount, price, createddate) values
(5001,177,"Nhat ky",1,20.2,"2020-11-02"),
(5002,144,"Python",2,27.4,"2020-11-02"),
(5002,777,"Become",1,19.2,"2020-11-02"),
(5002,111,"Doi gio hu",1,23.4,"2020-11-02"),
(5003,333,"21 bai hoc",1,17.6,"2020-11-02"),
(5003,111,"Doi gio hu",1,23.4,"2020-11-02"),
(5003,888,"Nhan qua",1,33.3,"2020-11-02"),
(5003,333,"21 bai hoc",1,17.6,"2020-11-02"),
(5003,155,"Don gian",2,15.6,"2020-11-02"),
(5004,555,"Biet hai long",1,31.2,"2020-11-02"),
(5004,122,"Japanese",2,18.9,"2020-11-02"),
(5005,222,"Homo",1,14.9,"2020-11-02"),
(5006,166,"Tieng het",1,10.2,"2020-11-02"),
(5006,144,"Python",1,27.4,"2020-11-02"),
(5007,444,"Hoa vang",1,22.7,"2020-11-02"),
(5007,666,"Thuat quan tri",1,18.5,"2020-11-02"),
(5007,999,"Khong gia dinh",1,37.5,"2020-11-02"),
(5008,133,"English",1,15.4,"2020-11-02"),
(5009,333,"21 bai hoc",1,17.6,"2020-11-02"),
(50010,222,"Homo",1,14.9,"2020-11-02"),
(50011,888,"Nhan qua",2,33.3,"2020-11-02");






