using System;

namespace Inventory
{
    class Supplier
    {
        private int _supplierID;
        private string _supplierName;
        private string _city;
        private string _phoneNo;
        private string _email;
        internal void AcceptDetails()
        {
            Console.Write("Enter the ID of supplier: ");
            _supplierID = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the name of supplier:");
            _supplierName = Console.ReadLine();
            Console.Write("Enter the city of supplier: ");
            _city = Console.ReadLine();
            Console.Write("Enter phone No.: ");
            _phoneNo = Console.ReadLine();
            Console.Write("Enter email address: ");
            _email = Console.ReadLine();
        }
        internal void DisplayDetails()
        {
            Console.WriteLine("\nSupplier Details:");
            Console.WriteLine("Supplier ID: " + _supplierID);
            Console.WriteLine("Supplier Name: " + _supplierName);
            Console.WriteLine("City: " + _city);
            Console.WriteLine("Phone No: " + _phoneNo);
            Console.WriteLine("Email: " + _email);
        }
        internal void DisplayDetails(int supplierID)
        {
            Console.WriteLine("SupplierID: " + supplierID);
        }

        internal void DisplayDetails(string supplierName)
        {
            Console.WriteLine("Supplier Name: " + supplierName);
        }
        internal void DisplayDetails(int supplierID, string supplierName)
        {
            Console.WriteLine("\nSupplier {0} with ID {1} lives in city {2}", supplierName, supplierID, _city);
        }
    }
}
