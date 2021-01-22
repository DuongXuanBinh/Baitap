using System;
using System.Collections.Generic;
using System.Text;

namespace GeometryExample
{
    class Cylinder
    {
        double radius;
        double height;
        double baseArea;
        double lateralArea;
        double TotalArea;
        double Volume;

        public void Process()
        {
            Console.WriteLine("Enter the dimenstions of the cylinder");
            Console.Write("Radius: ");
            radius = Convert.ToDouble(Console.ReadLine());
            Console.Write("Height: ");
            height = Convert.ToDouble(Console.ReadLine());
            baseArea = radius * radius * Math.PI;
            lateralArea = 2 * Math.PI * radius * height;
            TotalArea = 2 * Math.PI * radius * (height + radius);
            Volume = Math.PI * radius * radius * height;
        }
        public void Result()
        {
            Console.WriteLine("Cylinder Characteristics");
            Console.WriteLine("Raidus: {0:F2}. Height: {1:F2}", radius, height);
            Console.WriteLine("Base: {0:F2} | Lateral: {1:F2} | Total: {2:F2} | Volume: {3:F2}", baseArea, lateralArea, TotalArea, Volume);
        }
        static void Main(string[] args)
        {
            Cylinder objCylinder = new Cylinder();
            objCylinder.Process();
            objCylinder.Result();
        }
    }
}
