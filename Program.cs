using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace ss9
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread t = new Thread(Bom);
            t.Start(2);
        }
        public static void Bom(Object o)
        {
            int m = (int)o;

            while (m > 0)
            {
                m--;
                int s = 59;
                while (s >= 0)
                {
                    Console.WriteLine(m.ToString("D2") + ":" + s.ToString("D2"));
                    s--;
                    Thread.Sleep(100);
                }
            }
            Console.WriteLine("Bum Bum....");
        }

    }
}
