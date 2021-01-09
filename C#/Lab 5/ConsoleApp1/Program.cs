using System;

namespace ConsoleApp1
{
    class Program
    {
        public static void Main(string[] args)
        {
            int x = 1;
            Console.WriteLine("Before the call, x is " + x);
            Increment(x);
            Console.WriteLine("Before the call, x is " + x);
        }

        public static void Increment(int n)
        {
            n++;
            Console.WriteLine("n inside the method is " + n);
        }
    }
}
