using System;

namespace Snippet_6
{
    class Animal
    {
        public Animal()
        {
            Console.WriteLine("Constructor without parameters");
        }
        public Animal(string name)
        {
            Console.WriteLine("Constructor with a string parameter");
        }
    }
    class Canine : Animal
    {
        public Canine() : base("Lion")
        {
            Console.WriteLine("Derived Canine");
        }
    }
    class Details
    {
        static void Main(string[] args)
        {
            Canine objCanine = new Canine();
        }
    }
       
    
}
