using System;

namespace Employee
{
    class Program
    {
        static void Main(string[] args)
        {
            int employeeID;
            string employeeName;
            string designation ="";
            DateTime birthdate;
            char gender;
            byte yearsServed;
            double bonus = 0, salary = 0, taxAmount = 0, netSalary = 0;
            Console.Write("Enter the ID of employee:");
            employeeID = Convert.ToInt32(Console.ReadLine());
            if(employeeID>0)
            {
                Console.WriteLine("Enter the nmae of employee");
                employeeName = Console.ReadLine();
                
                if (employeeName != "" && employeeName.Length < 40)
                {
                    Console.Write("Enter the date of birth:");
                    birthdate = Convert.ToDateTime(Console.ReadLine());
                    int age = (DateTime.Today.Subtract(birthdate)).Days / 365;
                    if (age >= 18)
                    {
                        Console.Write("Enter gender[M/F]");
                        gender = Convert.ToChar(Console.ReadLine());
                        Console.WriteLine("Select designation(choose the number:");
                        Console.WriteLine("1.Manager\n2.System Analyst\n3.Developer\n4.Accountant");
                        Console.Write("Enter your choice:");
                        int choice = Convert.ToInt32(Console.ReadLine());

                        Console.Write("Enter the tenure in years: ");
                        yearsServed = Convert.ToByte(Console.ReadLine());

                        switch(choice)
                        {
                            case 1:
                                designation = "Manager";
                                salary = 25000;
                                break;
                            case 2:
                                designation = "System Analyst";
                                salary = 19000;
                                break;
                            case 3:
                                designation = "Developer";
                                salary = 15000;
                                break;
                            case 4:
                                designation = "Accountant";
                                salary = 11000;
                                break;
                        }
                        if(yearsServed>=3)
                        {
                            if(salary > 2000)
                            {
                                bonus = salary * 0.09;
                            }
                            else if(salary>14000&&salary<20000)
                            {
                                bonus = salary * 0.05;
                            }
                            else
                            {
                                bonus = salary * 0.02;
                            }
                        }
                        taxAmount = salary * 33 / 100;
                        netSalary = salary - taxAmount;

                        Console.WriteLine("Employee ID: " + employeeID);
                        Console.WriteLine("Employee Name: " + employeeName);
                        Console.WriteLine("Date of Birth: " + birthdate);
                        if (gender == 'M')
                        {
                            Console.WriteLine("Gender: Male");
                        }
                        else
                        {
                            Console.WriteLine("Gender: Female");
                        }
                        Console.WriteLine("Designation: " + designation);
                        Console.WriteLine("Tenure: " + yearsServed);
                        Console.WriteLine("Salary: {0}$", salary);
                        Console.WriteLine("Tax AMount{0}$", taxAmount);
                        Console.WriteLine("Net salary: {0:F2}$ is rounded off to:{1}$", netSalary, (int)netSalary);
                        Console.WriteLine("Bonus: {0}$", bonus);
                        Console.WriteLine("Total: {0} in month", (int)netSalary + bonus);
                    }
                    else
                    {
                        Console.WriteLine("Invalid entry for date of birth");
                    }
                }

                else
                {
                    Console.WriteLine("Invalid entry for employee name");
                }
            }
            else
            {
                Console.WriteLine("Invalid entry for employeeID");
            }
        }
    }
}
