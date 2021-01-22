using System;

namespace Snippet_20
{
    class Employee
    {
        private string _empName;
        private int _empID;
        public Employee()
        {
            _empName = "David";
            _empID = 101;
        }
        static void Main(string[] args)
        {
            Employee obj = new Employee();
            Employee obj2 = obj;
            obj = null;
            try
            {
                Console.WriteLine("Employee Name: " + obj._empName);
                Console.WriteLine("Employee ID: " + obj._empID);
            }catch(NullReferenceException objNull)
            {
                Console.WriteLine("Error: " + objNull);
            }catch(Exception objEx)
            {
                Console.WriteLine("Error: " + objEx);
            }
        }
    }
}
