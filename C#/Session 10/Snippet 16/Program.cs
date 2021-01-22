using System;

namespace Snippet_16
{
    class Students
    {
        string[] _names = { "James", "John", "Alexander" };
        static void Main(string[] args)
        {
            Students obj = new Students();
            try
            {
                obj._names[4] = "Micheal";
            }
            catch(Exception obj1)
            {
                Console.WriteLine("Error: " + obj1);
            }
        }
    }
}
