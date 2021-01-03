﻿using System;

namespace Snippet_3
{
    class Student
    {
        void printName(String firstName, String lastName)
        {
            Console.WriteLine("First Name = {0},Last Name = {1}", firstName, lastName);
        }
        static void Main(string[] args)
        {
            Student student = new Student();
            student.printName("Henry", "Parker");
            student.printName(firstName: "Henry", lastName: "Parker");
            student.printName(lastName: "Parker", firstName: "Henry");
            student.printName("Henry", lastName: "Parker");
        }
    }
}
