using System;
using System.Collections.Generic;
using System.Text;

namespace PRACTICAL
{
    class Book : Product_class
    {
        public Book(int product_id, string product_name, string producer, double price) : base(product_id, product_name, producer, price)
        {

        }

        public override double computeTax()
        {
            return this.Price / 100 * 8;
        }
    }
}