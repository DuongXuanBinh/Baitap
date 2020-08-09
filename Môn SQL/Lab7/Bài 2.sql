create database Aptech 
use Aptech
create table CLasses(
ClassName char(6),
Teacher varchar(30),
TimeSlot varchar(30),
Class int,
Lab int)
create unique clustered index MyClusteredIndex on Classes(ClassName) with (Pad_index = on,FillFactor = 70,Ignore_Dup_Key = on)
create nonclustered index Teacherindex on Classes(teacher)
drop index Teacherindex on Classes
create clustered index MyClusteredIndex on Classes(Classname) with(DROP_EXISTING = on, ALLOW_ROW_LOCKS = off,ALLOW_PAGE_LOCKS= ON, MAXDOP = 2) 
create index CLasslabindex on Classes(Class,Lab)
execute sp_helpindex Classes
