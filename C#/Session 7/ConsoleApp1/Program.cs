using System;

namespace ConsoleApp1
{
    class Animal
    {
        int legs;
        public Animal()
        {
            Console.WriteLine("Animal");
        }
        public void sound()
        {
            Console.WriteLine("Envery....");
        }
        
        public void gaugau()
        {
            Console.WriteLine
                ("gaugau");
        }

        public virtual void Eat()
        {
            Console.WriteLine("Every animal eats something");
        }
        protected void DoSomething()
        {
            Console.WriteLine("Every animal does something");
        }
        public override string ToString()
        {
            return "Animal2";
        }
    }
    class Cat:Animal
    {
        public void gaugau()
        {
            Console.WriteLine("gaugau2222");
        }
        public Cat()
        {
            Console.WriteLine("Cat");
        }
        public new void sound()
        {

            Console.WriteLine("aksudikjdsahkjsdahg");
        }
        public override void Eat()
        {
            Console.WriteLine("Cat loves to eat mouse");
        }
        public override string ToString()
        {
            return "cat2";
        }
        static void Main(string[] args)
        {
            Animal a = new Cat();
            Console.WriteLine(a.ToString());
            a.gaugau();
            a.sound();
            a.Eat();
            Cat b = new Cat();
            Console.WriteLine(b.ToString());
            b.sound();
            b.Eat();
        }
    }
}
