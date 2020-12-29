using System;

namespace Snippet_10
{
    class Program
    {
        static void Main(string[] args)
        {
            string[][] companies = new string[3][];
            companies[0] = new string[] { "Intel", "AMD" };
            companies[1] = new string[] { "IBM", "Micrrosoft", "Sun" };
            companies[2] = new string[] { "HP", "Canon", "Lexmark", "Epson" };
            for(int i = 0; i < companies.GetLength(0); i++)
            {
                Console.Write("List of companies in group" + (i + 1) + ":\t");
                for(int j = 0; j < companies[i].GetLength(0); j++)
                {
                    Console.Write(companies[i][j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}
