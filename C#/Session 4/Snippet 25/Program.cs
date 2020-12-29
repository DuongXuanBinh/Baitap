using System;

namespace Snippet_22
{
    class Program
    {
        static void Main(string[] args)
        {
            byte num = 0;
            while (true)
            {
                byte fact = 1;
                Console.Write("Please enter a number: ");
                num = Convert.ToByte(Console.ReadLine());
                if (num < 0)
                {
                    goto stop;
                }
                for(byte j = num; j > 0; j--)
                {
                    if (j > 4)
                    {
                        goto stop;
                    }
                    fact *= j;
                }
                Console.WriteLine("Factorial of {0} if {1}", num, fact);
            }
        stop:
            Console.WriteLine("Existing the program");
        }
    }
}
