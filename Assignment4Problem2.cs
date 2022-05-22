using System;

namespace Hero_vs_Monster
{
    class Program
    {
        static void Main(string[] args)
        {
            int HeroHealth, HeroWeapon, MonsterHealth, MonsterWeapon;
            Console.Write("Enter the hero's starting hit points: "); // Enter hero's health
            HeroHealth = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the damage the hero's weapon does per strike: "); // Enter Hero's Weapon Damage
            HeroWeapon = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the monster's starting hit points: "); // Enter Monster's Health
            MonsterHealth = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter the monster's damage per strike: "); // Enter Monster's Weapon Damage
            MonsterWeapon = Convert.ToInt32(Console.ReadLine());
            int round = 0;            
            while (HeroHealth>0 && MonsterHealth > 0) // Loop to start fight
            {
                Console.WriteLine("====== Round " + (round += 1) + " ======");
                Random r = new Random();
                int heroattack = r.Next(0, HeroWeapon);
                int monsterattack = r.Next(0, MonsterWeapon);
                Console.WriteLine("Hero attacks for: " + heroattack);
                Console.WriteLine("Monster has " + (MonsterHealth -= heroattack)+" HP left");
                if (MonsterHealth <= 0)
                {
                    Console.WriteLine("The monster dies and you earn 5 exp.");
                    Console.WriteLine("Battle ends...");
                    break;
                }
                Console.WriteLine("Monster attacks you for: " + monsterattack);
                Console.WriteLine("You have " + (HeroHealth -= monsterattack)+" HP left");
                if (HeroHealth <= 0 )
                {
                    Console.WriteLine("You are killed by the monster and lose 10 gold");
                    Console.WriteLine("Battle ends...");
                    break;
                }
            }
        }
    }
}
