﻿using System;

namespace Snippet_17
{
    class Program
    {
        static void Main(string[] args)
        {
            double loanAmount = 15590;
            float interest = 0.09F;
            double interestAmount = 0;
            double totalAmount = 0;
            interestAmount = loanAmount * interest;
            totalAmount = loanAmount + interestAmount;
            Console.WriteLine("Loan amount:$(0:#,###.#0)", loanAmount);
            Console.WriteLine("Interest rate: {0:0#%}", interest);
            Console.WriteLine("Total amount to be paid: ${0:#,###.#0}",totalAmount);

        }
    }
}
