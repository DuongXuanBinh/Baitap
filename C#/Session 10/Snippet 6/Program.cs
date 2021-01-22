using System;

namespace Automotive
{
    public class SpareParts
    {
        string _sparename;
        public SpareParts()
        {
            _sparename = "Gear Box";
        }
        public void Display()
        {
            Console.WriteLine("Spare Part name: " + _sparename);

        }
       
    }
}
