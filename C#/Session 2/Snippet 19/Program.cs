using System;

namespace Snippet_19
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dt = DateTime.Now;
            //return short date mm/dd/yyyy
            Console.WriteLine("Short date format (d):{0:d}",dt);
            //return long date (day,month,year)
            Console.WriteLine("Long date format (D):{0:D}", dt);
            //return full date time without seconds
            Console.WriteLine("Full datetime without seconds (f):{0:f}", dt);
            //return full date time with seconds
            Console.WriteLine("Full date time with seconds (F):{0:F}", dt);
            //return short date time without seconds
            Console.WriteLine("Short date time without seconds (g):{0:g}", dt);

        }
    }
}
