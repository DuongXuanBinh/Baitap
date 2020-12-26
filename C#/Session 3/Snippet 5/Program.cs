using System;

namespace Snippet_5
{
    class Audition
    {
        static void Main(string[] args)
        {
            byte numOne = 255;
            byte numTwo = 1;
            byte result = 0;
            try
            {
                //This code throws an overflow exception
                unchecked
                {
                    result = (byte)(numOne + numTwo);
                }
                Console.WriteLine("Result:" + result);
            }
            catch (OverflowException ex)
            {
                Console.WriteLine(ex);
            }
        }
    }
}
