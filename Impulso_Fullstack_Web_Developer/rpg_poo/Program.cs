using System;
using rpg_poo.src.Entities;

namespace rpg_poo
{
    class Program
    {
        static void Main(string[] args)
        {
            Hero hero = new Hero("Arus", 23, "Knight");  
            Hero wizard = new Hero("Jenica", 23, "White Wizard");
          
            Console.Write(hero);
        }
    }
}
