using System;

namespace Snippet_11
{
    class ITSystem
    {
        public virtual void Print()
        {
            Console.WriteLine("The system should be handled carefully");
        }
    }
    class CompanySystem: ITSystem
    {
        public sealed override void Print()
        {
            Console.WriteLine("The system information is confidential");
            Console.WriteLine("this information should not be overriden");
        }
    }
    class SealedSystem : CompanySystem
    {
        public override void Print()
        {
            Console.WriteLine("this statement wont get executed");
        }
    
        static void Main(string[] args)
        {
            SealedSystem objSealed = new SealedSystem();
            objSealed.Print();
        }
    }
}
