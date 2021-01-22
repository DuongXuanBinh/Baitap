using System;

namespace Student
{
    class StudentDetails
    {
        string _studName = "Alexander";
        int _studID = 30;
        public StudentDetails()
        {
            Console.WriteLine("Student Name: " + _studName);
            Console.WriteLine("Student ID: " + _studID);
        }
    }
}
namespace Examination
{
    class ScoreReport
    {
        public string Subject = "Science";
        public int Marks = 60;
        static void Main(string[] args)
        {
            Student.StudentDetails obj = new Student.StudentDetails();
            ScoreReport obj1 = new ScoreReport();
            Console.WriteLine("Subject: " + obj1.Subject);
            Console.WriteLine("Marks: " + obj1.Marks);
        }

    
    }
}
