﻿using System;

namespace Snippet_15
{
    class Dimension
    {
        double _length;
        double _breadth;
        public double Area (double _length, double _breadth)
        {
            this._length = _length;
            this._breadth = _breadth;
            return _length * _breadth;
        }
        static void Main(string[] args)
        {
            Dimension objDimension = new Dimension();
            Console.WriteLine("Area of rectangle= "+objDimension.Area(10.5,12.5));
        }
    }
}
