﻿using System;
using rpg_poo.src.Entities;

namespace rpg_poo
{
    class Program
    {
        static void Main(string[] args)
        {
            Arus hero = new Arus("Arus", 23, "Knight");  
          
            Console.Write(hero);
        }
    }
}
