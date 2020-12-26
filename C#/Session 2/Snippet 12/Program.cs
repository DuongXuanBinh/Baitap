using System;

namespace Snippet_12
{
    class Program
    {
        static void Main(string[] args)
        {
            int number, result;
            number = 5;
            result = 100 * number;
            Console.WriteLine("Result is {0} is multiplied by {1}", result, number);
            result = 150 / number;
            Console.WriteLine("Result if {0} when 150 is devided by {1}", result, number);
        }
    }
}
