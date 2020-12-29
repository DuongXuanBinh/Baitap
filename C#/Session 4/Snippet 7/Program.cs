using System;

namespace Snippet_7
{
    class Months
    {
        static void Main(string[] args)
        {
            string input;
            Console.WriteLine("Enter the month");
            input = Console.ReadLine().ToUpper();
            switch (input)
            {
                case "Jannuary":
                case "March":
                case "May":
                    Console.WriteLine("This month has 31 days");
                    break;
                case "April":
                case "June":
                    Console.WriteLine("This month has 30 days");
                    break;
                default:
                    Console.WriteLine("Incorrect choice");
                    break;
            }
        }
    }
}
