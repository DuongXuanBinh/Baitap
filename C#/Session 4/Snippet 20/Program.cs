using System;

namespace Snippet_20
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Even numbers in the range of 1-10");
            for(int i = 1; j <= 10; i++)
            {
                if (i % 2 != 0)
                {
                    continue;
                }
                Console.Write(i + "");
            }
        }
    }
}
