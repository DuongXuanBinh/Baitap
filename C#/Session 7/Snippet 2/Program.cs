using System;

namespace Snippet_2
{
    class Animal
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats something.");
        }
        public void DoSomeThing()
        {
            Console.WriteLine("EVery animal does something.");
        }
    }
    class Cat : Animal
    {
        static void Main(string[] args)
        {
            Cat objCat = new Cat();
            objCat.Eat();
            objCat.DoSomeThing();
        }
    }
}
