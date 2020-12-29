using System;

namespace Snippet_11
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] studentNames = new string[3] { "Ashley", "Joe", "Mikei" };
            foreach(string stuName in studentNames)
            {
                Console.WriteLine("Congratulations!!" + stuName + ". You have been granted an extra leave");
            }
        }
    }
}
