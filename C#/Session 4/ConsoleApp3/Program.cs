using System;

namespace ConsoleApp3
{
    class Program
    {
        static void Main(string[] args)
        {
            int english, science, math,total;
            string name;
            Console.WriteLine("Enter name:");
            name = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter english mark:");
            english = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter science mark:");
            science = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter math mark:");
            math = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Student: " + name);
            
            if((0<=english&&english<=100)&& (0 <= math && math <= 100)&& (0 <= science && science <= 100))
            {
                total = english + science + math;
                if (english < 35 && science < 35 && math < 35)
                {
                    Console.WriteLine("Failed");
                }
                else
                {
                    if((35<=english&&english<60)&& (35 <= science && science < 60)&& (35 <= math && math < 60))
                    {
                       Console.WriteLine("Got total {0} and 0$ scholarship",total);
                    }else if((60 <= english && english < 75) && (60 <= science && science < 75) && (60 <= math && math < 75))
                    {
                        Console.WriteLine("Got total {0} and $1000 scholarship", total);
                    }else
                    {
                        Console.WriteLine("Got total {0} and $1500 scholarship", total);
                    }
                }
            }
            else
            {
                Console.WriteLine("Invalid marks");
            }
        }
    }
}
