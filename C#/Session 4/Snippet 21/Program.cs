﻿using System;

namespace Snippet_21
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            display:
            Console.WriteLine("Hello World!");
            i++;
            if (i < 5)
            {
                goto display;
            }
        }
    }
}
