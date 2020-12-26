using System;

namespace Snippet_10
{
    class FileDemo
    {
        static void Main(string[] args)
        {
            string path = "C:\\WIndows\\MyFile.txt";
            bool found = true;
            if (found)
            {
                Console.WriteLine("File path:\'" + path + "\'");
            }
            else
            {
                Console.WriteLine("File not found!\a");
            }
        }
    }
}
