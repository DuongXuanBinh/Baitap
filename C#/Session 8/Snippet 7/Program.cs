using System;

namespace Snippet_7
{
    interface ITerrestrialAnimal
    {
        string Eat();
    }
    interface IMarineAnimal
    {
        string Eat();
    }
    class Crocodile : ITerrestrialAnimal, IMarineAnimal
    {
        string ITerrestrialAnimal.Eat()
        {
            string terCroc = "Crocodile eats other animals";
            return terCroc; 
        }
        string IMarineAnimal.Eat()
        {
            string marCroc = "Crocodile eats fish and marine animals";
            return marCroc;
        }
        public string EatTerrestrial()
        {
            ITerrestrialAnimal obj;
            obj = this;
            return obj.Eat();
        }
        public string EatMarine()
        {
            IMarineAnimal obj;
            obj = this;
            return obj.Eat();
        }
    
        public static void Main(string[] args)
        {
            Crocodile obj = new Crocodile();
            string terCroc = obj.EatTerrestrial();
            Console.WriteLine(terCroc);
            string marCroc = obj.EatMarine();
            Console.WriteLine(marCroc);
        }
    }
}
