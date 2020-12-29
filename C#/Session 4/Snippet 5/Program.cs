using System;

namespace Snippet_5
{
    class Program
    {
        static void Main(string[] args)
        {
            int day = 5;
            switch(day)
            {
                case 1:
                    Console.WriteLine("Sunday");
                    break;
                case 2:
                    Console.WriteLine("Monday");
                    break;
                default:
                    Console.WriteLine("Another day");
                    break;
            }


        }
    }
}
