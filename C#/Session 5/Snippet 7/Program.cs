﻿using System;

namespace Snippet_7
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] days = new string[7];
            days[0] = "Sunday";
            days[1] = "monday";
            days[2] = "tuesday";
            days[3] = "Wednesday";
            days[4] = "Thursday";
            days[5] = "Friday";
            days[6] = "Saturday";
            for(int i = 0; i < days.Length; i++)
            {
                Console.WriteLine(days[i]);
            }
        }
    }
}
