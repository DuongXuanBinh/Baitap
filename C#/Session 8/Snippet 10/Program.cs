using System;

namespace Snippet_10
{
    interface ICalculate
    {
        double Area();
    }
    class Rectangle: ICalculate
    {
        float _length;
        float _breadth;
        public Rectangle(float valOne,float valTwo)
        {
            _length = valOne;
            _breadth = valTwo;
        }
        public double Area()
        {
            return _length * _breadth;
        }
        static void Main(string[] args)
        {
            Rectangle obj = new Rectangle(10.2F, 20.3F);
            if(obj is ICalculate)
            {
                Console.WriteLine("Area of Rectangle:{0:F2}", obj.Area());
            }
            else
            {
                Console.WriteLine("Interface method not implemented");
            }
        }
    }
}
