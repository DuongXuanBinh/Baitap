using System;

namespace Snippet_21
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime date = DateTime.Now;
            Console.WriteLine("Date is {0:dddMMMdd,yyyy}", date);
            Console.WriteLine("Time is {0:hh:mm tt}", date);
            Console.WriteLine("24 hour time is {0:HH:mm}", date);
            Console.WriteLine("Time with seconds: {0:hh:mm:ss tt", date);
            Console.WriteLine("Day of month:{0:m}", date);
            Console.WriteLine("Year:{0:yyyy}", date);
        }
    }
}
