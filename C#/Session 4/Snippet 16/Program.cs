using System;

namespace Snippet_16
{
    class Program
    {
        static void Main(string[] args)
        {
            char c;
            int numOne;
            int numTwo;
            int result;
            for(; ; )
            {
                Console.WriteLine("Enter number one");
                numOne = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter number two");
                numTwo = Convert.ToInt32(Console.ReadLine());
                result = numOne + numTwo;
                Console.WriteLine("Result of addition: " + result);
                Console.WriteLine("Do you wish to continue (y/n):");
                c = Convert.ToChar(Console.ReadLine());
                if (c == 'Y' || c == 'y')
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
