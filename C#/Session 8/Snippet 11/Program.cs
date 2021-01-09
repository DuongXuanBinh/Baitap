using System;

namespace Snippet_11
{
    interface ISet
    {
        void AcceptDetails(int valOne, string valTwo);
    }
    interface IGet
    {
        void Display();
    }
    class Employee: ISet
    {
        int _empID;
        string _empName;
        public void AcceptDetails(int valOne,string valTwo)
        {
            _empID = valOne;
            _empName = valTwo;
        }
        static void Main(string[] args)
        {
            Employee obj = new Employee();
            obj.AcceptDetails(10, "jack");
            IGet objGet = obj as IGet;
            if (objGet != null)
            {
                objGet.Display();
            }
            else
            {
                Console.WriteLine("Invalid casting occured");
            }
        }
    }
}
