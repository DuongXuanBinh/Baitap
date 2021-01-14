using System;

namespace Snippet_2
{
    class World
    {
        public void gaugau()
        {
            Console.WriteLine("a");
        }
    }
    abstract class Animal:World
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats food in order to survive");
        }
        public abstract void AnimalSound();
    
    }
    class Lion : Animal
    {
        public override void AnimalSound()
        {
            Console.WriteLine("Lion roars");
        }
        static void Main(string[] args)
        {
            Lion objLion = new Lion();
            objLion.AnimalSound();
            objLion.Eat();
            
        }
    }
}
