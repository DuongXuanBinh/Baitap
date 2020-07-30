DECLARE @empId int
SET @empId=1
	SELECT FirstName, LastName FROM Employees
	WHERE EmployeeID=@empId