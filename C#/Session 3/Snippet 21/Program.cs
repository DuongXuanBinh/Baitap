using System;

namespace Snippet_21
{
    class LargerNumber
    {
        static void Main(string[] args)
        {
            int numOne = 5;
            int numTwo = 25;
            int numThree = 15;
            int result = 0;
            if (numOne > numTwo)
            {
                result = (numOne > numThree) ? result = numOne : result = numThree;
            }
            else
            {
                result = (numTwo > numThree) ? result = numTwo : result = numThree;
            }
            if (result != 0)
                Console.WriteLine("{0} is the largest number", result);
        }
    }
}
