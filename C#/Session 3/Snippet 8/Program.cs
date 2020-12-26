using System;

namespace Snippet_8
{
    class Program
    {
        static void Main(string[] args)
        {
            int lefVal = 50;
            int rightVal = 100;
            Console.WriteLine("Equal:" + (lefVal == rightVal));
            Console.WriteLine("Not equal: " + (lefVal != rightVal));
            Console.WriteLine("Greater:" + (lefVal > rightVal));
            Console.WriteLine("Less:" + (lefVal < rightVal));
            Console.WriteLine("Greater or equal: " + (lefVal >= rightVal));
            Console.WriteLine("Less or equal: " + (lefVal <= rightVal));
        }
    }
}
