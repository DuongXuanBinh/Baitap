using System;

namespace Ex2
{
    class Zoo
    {
        int weight;
        string name;

        public void Show()
        {
            Console.WriteLine("Name: {0}, Weight: {1}\n",name,weight);
        }
        public void SetMe(int weight, string name)
        {
            this.weight = weight;
            this.name = name;
        }
        
    }
}
