using System;
class Program
{
    static void Main(string[] args)
    {
        Employee.NextId = 1000000;
        Employee employee1 = new Employee("Inigo", "Montoya");
        Employee employee2 = new Employee("Princess", "Buttercup");
        Console.WriteLine("{0} {1} ({2})", employee1.FirstName, employee1.LastName, employee1.Id);
        Console.WriteLine("{0} {1} ({2})", employee2.FirstName, employee2.LastName, employee2.Id);
        Console.WriteLine($"NextId = { Employee.NextId }");

        Console.ReadKey();
    }
    // ... khai báo của lớp Employee nằm đây, bỏ qua cho gọn code
}