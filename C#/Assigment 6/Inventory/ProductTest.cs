using System;
using System.Collections.Generic;
using System.Text;

namespace Inventory
{
    class ProductTest
    {
        static void Main(String[] args)
        {
            Product objProduct = new Product();
            objProduct.DisplayDetails();
            Console.WriteLine();

            Product objProduct1 = new Product(102);

            objProduct1.DisplayDetails();
            Console.WriteLine();

            Product objProduct2 = new Product(103, "Televisions", 5660.5F, 68);
            objProduct2.DisplayDetails();
;
        }
    }
}
