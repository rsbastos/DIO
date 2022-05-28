using System;
using rpg_poo.src.Entities;

namespace rpg_poo
{
    class Program
    {
        static void Main(string[] args)
        {
            Arus hero = new Arus();  
            hero.Name = "Arus";
            hero.Level = 2;
            hero.HeroType = "Knight";

            Console.Write("");
        }
    }
}
