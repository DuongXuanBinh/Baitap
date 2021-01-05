using System;

namespace Pharma
{
    class Medicine
    {
        int medicineCode;
        string medicineName;
        string menufacturerName;
        float price;
        int quantity;
        DateTime manufacturedDate;
        DateTime expiryDate;
        int batch;

        public Medicine(int code, string name, string mName, float price, int quantity, DateTime manufacturedDate, DateTime expiryDate, int batch)
        {
            medicineCode = code;
            medicineName = name;
            menufacturerName = mName;
            this.price = price;
            this.quantity = quantity;
            this.manufacturedDate = manufacturedDate;
            this.expiryDate = expiryDate;
            this.batch = batch;
        }
        public Medicine()
        {
        }
        public Medicine Accept()
        {
            Console.WriteLine("Enter medicine code:");
            int code = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter medicine name:");
            string name = Console.ReadLine();
            Console.WriteLine("Enter the manufacturer:");
            string mName = Console.ReadLine();
            Console.WriteLine("Enter the price:");
            float price = Convert.ToSingle(Console.ReadLine());
            Console.WriteLine("Enter the quantity:");
            int quantity = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the manufactured date:");
            DateTime manu = Convert.ToDateTime(Console.ReadLine());
            Console.WriteLine("Enter the expiry date:");
            DateTime exp = Convert.ToDateTime(Console.ReadLine());
            Console.WriteLine("Enter the batch number: ");
            int batch = Convert.ToInt32(Console.ReadLine());
            Medicine obj = new Medicine(code, name, mName, price, quantity, manu, exp, batch);
            return obj;
        }
        public void Print()
        {
            Console.WriteLine("Medicince Detail:");
            Console.WriteLine("Medicine code:" + medicineCode);
            Console.WriteLine("Medicine name: " + medicineName);
            Console.WriteLine("Medicine's manufacturer: " + menufacturerName);
            Console.WriteLine("Medicine's price:" + price);
            Console.WriteLine("Quantity in stock: " + quantity);
            Console.WriteLine("Medicine's manufactured date:" + manufacturedDate);
            Console.WriteLine("Medicine's expiry date: " + expiryDate);
            Console.WriteLine("Batch number: " + batch);
        }
        public void Print(int code)
        {
            if (medicineCode == code)
            {
                Console.WriteLine("Quantity in stock: " + quantity);
            }
            else
            {
                Console.WriteLine("Medicine code: {0} - no found", code);
            }
        }
        public void Print(int code, string name)
        {
            if (medicineCode == code && medicineName == name)
            {
                Console.WriteLine("Medicine's manufactured date:" + manufacturedDate);
                Console.WriteLine("Medicine's expiry date: " + expiryDate);
            }
            else
            {
                Console.WriteLine("Medicine code: {0} with name {1}- no found", code, name);
            }
        }
        public void Increase()
        {
            if (quantity == 0)
            {
                quantity = 50;
            }
            else
            {
                Console.WriteLine("Quantity greater than 0");
            }
        }
        
    }
    

    }
class Sales
{
    int medicineCode;
    int sold;
    float planned;
    float actual;
    string region;

    public Sales()
    {
    }
    public Sales(int code, int sold, float planned, float actual, string region)
    {
        code = medicineCode;
        this.sold = sold;
        this.planned = planned;
        this.actual = actual;
        this.region = region;
    }
    public Sales Accept()
    {
        Console.WriteLine("Enter the medicine code:");
        int code = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter the sold quantity:");
        int sold = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Enter the planned sales:");
        float planned = Convert.ToSingle(Console.ReadLine());
        Console.WriteLine("Enter the actual sales:");
        float actual = Convert.ToSingle(Console.ReadLine());
        Console.WriteLine("Enter the region: ");
        string region = Console.ReadLine();
        Sales obj = new Sales(code, sold, planned, actual, region);
        return obj;
    }
    public void Display()
    {
        Console.WriteLine("Sale details:");
        Console.WriteLine("Medicine code:" + medicineCode);
        Console.WriteLine("Sold quantity: " + sold);
        Console.WriteLine("Planned sales: " + planned);
        Console.WriteLine("Actual sales: " + actual);
        Console.WriteLine("Region: " + region);
    }
   
    public void Display(int code)
    {
        if (this.medicineCode == code)
        {
            Console.WriteLine("Differ between actual sales and planned sales:{0}", this.actual - this.planned);
        }
        else
        {
            Console.WriteLine("Medicine code {0} - no found", code);
        }

    }
}

