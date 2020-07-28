create table newemployees
(employeeid smallint,
firstname char(10),
lastname char(10),
department varchar(50),
hireddate datetime,
salary money);

insert into newemployees
values(11,'kevin','blaine','research','2006-07-31 00:00:00.000',54000);

with employeetemp (employeeid, firstname, lastname, department, hireddate, salary)
as
(
select * from newemployees
)
insert into Employees
selecct * from employeetemp