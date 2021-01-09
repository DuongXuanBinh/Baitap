using System;

namespace Snippet_8
{
    interface IAnimal
    {
        void Drink();
    }
    interface Icarnivorous
    {
        void Eat();
    }
    interface IReptile: IAnimal, Icarnivorous
    {
        void Habitat();
    }
    class Crocodile: IReptile
    {
        public void Drink()
        {
            Console.WriteLine("Drinks fresh water");
        }
        public void Habitat()
        {
            Console.WriteLine("Can stay in Water and Land");
        }
        public void Eat()
        {
            Console.WriteLine("Eats Flesh");
        }
        static void Main(string[] args)
        {
            Crocodile obj = new Crocodile();
            Console.WriteLine(obj.GetType().Name);
            obj.Habitat();
            obj.Eat();
            obj.Drink();
        }
    }
}
