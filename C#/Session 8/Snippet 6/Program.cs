﻿using System;

namespace Snippet_6
{
    interface ITerrestrialAnimal
    {
        void Eat();
    }
    interface IMarineAnimal
    {
        void Swim();
    }
    class Crocodile: ITerrestrialAnimal, IMarineAnimal
    {
        public void Eat()
        {
            Console.WriteLine("The Crocodile eats flesh");
        }
        public void Swim()
        {
            Console.WriteLine("The Crocodile can swim four times faster than an Olympic swimmer");
        }
        static void Main(string[] args)
        {
            Crocodile obj = new Crocodile();
            obj.Eat();
            obj.Swim();
        }
    }
}
