using System;
using System.Collections.Generic;
using System.Text;

namespace Pharma
{
    class Test
    {
        static void Main(string[] args)
        {
            Medicine obj = new Medicine();
            obj.Print();
            Medicine obj1 = new Medicine(1, "alpha", "ABC company", 13.5F, 12, new DateTime(10/10/2020),new DateTime(10/10/2925),2);
            obj1.Print();
            Medicine obj2 = new Medicine();
            Medicine obj3 = obj2.Accept();
            obj3.Print();
            obj3.Print(3);
            obj1.Print(1, "alpha");

            Sales sale1 = new Sales();
            sale1.Display();
            Sales sale2 = new Sales(1, 3, 23.5F, 17.3F, "HN");
            Sales s2 = new Sales();
            Sales s3 = s2.Accept();
            s3.Display();
            s3.Display(3);
                
        }
    }
}
