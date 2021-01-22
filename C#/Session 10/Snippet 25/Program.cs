using System;

namespace Snippet_25
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] names = { "John", "James" };
            int numOne = 10;
            int result = 0;
            int index = 0;
            try
            {
                index = 3;
                names[index] = "Smith";
                result = 130 / numOne;
            }
            catch(DivideByZeroException objDivide)
            {
                Console.WriteLine("Divide by 0" + objDivide);
            }
            catch (IndexOutOfRangeException objIndex)
            {
                Console.WriteLine("Wrong number of arguments supplied" + objIndex);
            }catch(Exception obj)
            {
                Console.WriteLine("Error: " + obj);
            }
            Console.WriteLine(result);
        }
    }
}
