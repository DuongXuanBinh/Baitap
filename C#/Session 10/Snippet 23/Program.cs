using System;

namespace Snippet_23
{
    class DivisionError
    {
        static void Main(string[] args)
        {
            int numOne = 133;
            int numTwo = 0;
            int result;
            try
            {
                result= numOne / numTwo;
            }catch (DivideByZeroException obj)
            {
                Console.WriteLine("Exception caught: " + obj);
            }
            finally
            {
                Console.WriteLine("This finally block will always be executed");
            }
        }
    }
}
