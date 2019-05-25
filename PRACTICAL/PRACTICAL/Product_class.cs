using System;
using System.Collections.Generic;
using System.Text;

namespace PRACTICAL
{
    public abstract class Product_class
    {
        public int Product_id { get; set; }
        public string Product_name { get; set; }
        public string Producer { get; set; }
        public double Price { get; set; }

        public Product_class(int product_id, string product_name, string producer, double price)
        {
            this.Product_id = product_id;
            this.Product_name = product_name;
            this.Producer = producer;
            this.Price = price;
        }



        public abstract double computeTax();
    }
}