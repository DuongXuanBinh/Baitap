using System;

namespace Snippet_22
{
    class Program
    {
        static void Evaluate(string arg)
        {
            var val = arg ?? throw new ArgumentException("Invalid argument");
            Console.WriteLine("Reached this point");
        }
        static void Main(string[] args)
        {
            Evaluate("numbers");
            Evaluate(null);
        }
    }
}
