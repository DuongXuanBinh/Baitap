﻿using System;

namespace Snippet_20
{
    class Concatenation
    {
        static void Main(string[] args)
        {
            int num = 6;
            string msg = "";
            if (num < 0)
            {
                msg = "The number" + num + " is negative";
            }
            else if ((num % 2) == 0)
            {
                msg = "The number" + num + " is even";
            }
            else
            {
                msg = "The number" + num + "is odd";
            }
            if (msg != "")
                Console.WriteLine(msg);
        }
    }
}
