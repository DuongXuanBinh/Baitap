using IO = System.Console;

using Emp = Bank.Accounts.EmployeeDetails;

    class AliasExample
    {
        static void Main(string[] args)
        {
        Emp.Employees obj = new Emp.Employees();
        obj.EmpName = "Peter";
        IO.WriteLine("Employee Name: " + obj.empName);
        }
    }

