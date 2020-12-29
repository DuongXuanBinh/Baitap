using System;

namespace Snippet_5
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] students = new string[3] { "James", "Alex", "Fernado" };
            for(int i = 0; i < students.Length; i++)
            {
                Console.WriteLine(students[i]);
            }
        }
    }
}
