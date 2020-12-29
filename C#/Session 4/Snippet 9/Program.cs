using System;

namespace Snippet_9
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            int j;
            while(i <= 5)
            {
                j = 0;
                while (j <= 1)
                {
                    Console.Write("*");
                    j++;
                }
                Console.WriteLine();
                i++;
            }
        }
    }
}
