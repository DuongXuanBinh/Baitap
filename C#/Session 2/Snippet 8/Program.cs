using System;

namespace Snippet_8
{
    class Program
    {
        static void Main(string[] args)
        {
            const float _pi = 3.14F;
            float radius = 5;
            float area = _pi * radius * radius;
            Console.WriteLine("Area of the circle is " + area);
        }
    }
}
