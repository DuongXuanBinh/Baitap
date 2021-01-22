using System;

namespace Snippet_24
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] name = { "John", "James" };
            int numOne = 0;
            int result;
            try
            {
                Console.WriteLine("This is the outer try block");
                try
                {
                    result = 133 / numOne;
                }
                catch(ArithmeticException objMaths)
                {
                    Console.WriteLine("Divide by 0 " + objMaths);
                }
                name[2] = "Smith";
            }
            catch(IndexOutOfRangeException objIndex)
            {
                Console.WriteLine("Wrong number of arguments supplied" + objIndex);
            }
        }
    }
}
