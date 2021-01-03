using System;

namespace Snippet_5
{
    class optionalParamterExample
    {
        void printMessage(String message = "Hello user!")
        {
            Console.WriteLine("{0}", message);
        }
        static void Main(string[] args)
        {
            optionalParamterExample opExample = new optionalParamterExample();
            opExample.printMessage("Welcome User!");
            opExample.printMessage();
        }
    }
}
