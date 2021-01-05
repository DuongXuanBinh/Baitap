﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Inventory
{
    class Product
    {
        private int _productID;
        private string _productName;
        private float _price;
        private int _stock;

        public Product()
        {
            _productID = 101;
            _productName = "Refrigerator";
            _price = 420.5F;
            _stock = 30;
        }
        public Product(int id)
        {
            _productID = id;
            _productName = "washing machine";
            _stock = 25;
            _price = 677.3F;
        }
        public Product(int id,string name, float price,int stock)
        {
            _productID = id;
            _productName = name;
            _price = price;
            _stock = stock;
        }
        public void DisplayDetails()
        {
            Console.WriteLine("Product Details:");
            Console.WriteLine("Product ID: " + _productID);
            Console.WriteLine("Product Name: " + _productName);
            Console.WriteLine("Price: " + _price + " $");
            Console.WriteLine("Quantity in stock: " + _stock);
        }
    }
}
