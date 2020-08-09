Create database lab07
use AdventureWorks2016CTP3
select * into lab07.dbo.Workorder from Production.WorkOrder
use lab07
Select * into WorkorderIX from Workorder
SELECT*FROM Workorder
SELECT*FROM WorkorderIX
Create index IX_workorderID on WorkorderIX(WorkorderID)
SELECT*FROM WorkOrder where WorkOrderID=72000 
SELECT*FROM WorkOrderIX where WorkOrderID=72000 


