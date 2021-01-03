using System;

namespace Bank
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] customerID = new int[3];
            int[] accountNumber = new int[3];
            char[] type = new char[3];
            DateTime[] date = new DateTime[3];
            int[] deposit = new int[3];
            int[] balance = new int[3] { 0, 0, 0 };
            for(int i = 0; i < customerID.Length; i++)
            {
                Console.WriteLine("Enter the ID of customer:");
                customerID[i] = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter account number:");
                accountNumber[i] = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter account type [Fixed/Savings]:(F/S)");
                type[i] = Console.ReadLine()[0];
                Console.WriteLine("Enter the date of opening account[DD/MM/YYYY]:");
                date[i] = Convert.ToDateTime(Console.ReadLine());
                Console.WriteLine("Enter the amount deposited:");
                deposit[i] = Convert.ToInt32(Console.ReadLine());    
            }
            
            Console.WriteLine("Account Details: ");
            Console.WriteLine("ID\tA/c No.\tA/c Type\t\tOpening Date\t\tDeposit($)\tBalance($)");
            for(int i = 0; i < customerID.Length; i++)
            {
                Console.WriteLine("{0}\t{1}\t{2}\t\t\t{3}\t{4}\t{5}", customerID[i], accountNumber[i], type[i], date[i], deposit[i],balance[i]+deposit[i]);
            }

            Console.WriteLine("Enter the account number whose details you want to view: ");
            int number = Convert.ToInt32(Console.ReadLine());
            for(int i = 0; i < customerID.Length; i++)
            {
                if (customerID[i] == 10)
                {
                    Console.WriteLine("Record Found!");
                    Console.WriteLine("ID\tA/c No.\tA/c Type\t\tOpening Date\t\tDeposit($)\tBalance($)");
                    Console.WriteLine("{0}\t{1}\t{2}\t\t\t{3}\t{4}\t{5}", customerID[i], accountNumber[i], type[i], date[i], deposit[i], balance[i] + deposit[i]);
                }
                else
                {
                    Console.WriteLine("NO record found!");
                }
            }
            

        }
    }
}
