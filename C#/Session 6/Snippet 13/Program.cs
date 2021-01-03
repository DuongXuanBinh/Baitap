using System;

namespace Snippet_13
{
    class OutParameters
    {
        static void Deprecation(out int val)
        {
            val = 2000;
            int dep = val * 5 / 100;
            int amt = val - dep;
            Console.WriteLine("Depreciation Amount: " + dep);
            Console.WriteLine("Reduced value after deprecation: " + amt);
        }
        static void Main(string[] args)
        {
            int value;
            Deprecation(out value);
        }
    }
}
