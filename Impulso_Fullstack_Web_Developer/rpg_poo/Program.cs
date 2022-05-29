using System;
using rpg_poo.src.Entities;

namespace rpg_poo
{
    class Program
    {
        static void Main(string[] args)
        {
            Hero arus = new Hero("Arus", 23, "Knight");  
            Wizard wizard = new Wizard("Jenica", 23, "White Wizard");
          
            Console.WriteLine(arus.Attack());
            Console.Write(wizard.Attack());
        }
    }
}
