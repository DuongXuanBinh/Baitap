using System;
using System.Collections.Generic;
using System.Text;

namespace Inventory
{
    class SupplierTest
    {
        static void Main(string[] args)
        {
            Supplier objSupplier = new Supplier();
            Supplier obj = new Supplier();

            objSupplier.AcceptDetails();

            int id = 0;
            string name = "";
            Console.Write("\nEnter the id of the supplier: ");
            id = Convert.ToInt32(Console.ReadLine());

            objSupplier.DisplayDetails(id);

            Console.Write("\nEnter the name if the supplier:");
            name = Console.ReadLine();

            obj.DisplayDetails(id,name);
        }
    }
}
