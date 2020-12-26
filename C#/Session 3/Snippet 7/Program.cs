using System;

namespace Snippet_7
{
    class Program
    {
        static void Main(string[] args)
        {
            int valueOne = 10;
            int valueTwo = 2;
            int add = valueOne + valueTwo;
            int sub = valueOne - valueTwo;
            int mult = valueOne * valueTwo;
            int div = valueOne / valueTwo;
            int modu = valueOne % valueTwo;
            Console.WriteLine("Addition" + add);
            Console.WriteLine("Substraction" + sub);
            Console.WriteLine("Multiplication" + mult);
            Console.WriteLine("Division" + div);
            Console.WriteLine("Remainder" + modu);
        }
    }
}
