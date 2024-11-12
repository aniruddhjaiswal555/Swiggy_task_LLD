package service;
import model.*;
import util.*;   
public class Arena {
    public Arena(){}
    public void startGame(Player A , Player B)
    {
        Player attacker = (A.getHealth() < B.getHealth()) ? A : B;
        Player defender = (A.getHealth() < B.getHealth()) ? B : A;
        while(A.getHealth() > 0 && B.getHealth() > 0)
        {
            String attackerName = "";
            String defenderName = "";
            if(attacker == A)
            {
                 attackerName = "A";
                 defenderName = "B";
            }
            else
            {
                attackerName = "B";
                defenderName = "A";
            }
            int attackerDiceValue = Dice.roll();
            int defenderDiceValue = Dice.roll();
            int damageGiven = attacker.getAttack() * attackerDiceValue;
            int damageDefended = defender.getStrength() * defenderDiceValue;
            int damage = damageGiven - damageDefended;

            if(damage > 0)
            {
                defender.reduceHealth(damage);
                System.out.println("Player "+ attackerName + " attacked on " + "Player " +
                                   defenderName + " and give him damage of " + damage);
                System.out.println("now Player "+defenderName+" health is : "+defender.getHealth());
            }
            else
            {
                System.out.println("Player "+ attackerName +" attacken on Player "+ defenderName);
                System.out.println("Player "+defenderName+" defended successfully");
            }
            System.out.println();
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
}
