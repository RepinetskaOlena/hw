using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Hotline
{
    class Result
    {
     
        public string Name { get; set ; }
        public string Price { get ; set ; }
      
        public Result(string name, string price)
        {
            Name = name;
            Price = price;
        }
        public override string ToString()
        {
            return Name + " " + Price;
        }
    }
}
