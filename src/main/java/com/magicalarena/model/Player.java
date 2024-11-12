package model;
public class Player {
    private int health;
    private int strength;
    private int attack;
    public Player(){}
    public Player(int h , int s , int a)
    {
        this.health = h;
        this.strength = s;
        this.attack = a;
    }
    public int getHealth()
    {
        return health;
    }
    public int getStrength()
    {
        return strength;
    }
    public int getAttack()
    {
        return attack;
    }
    public void reduceHealth(int damage)
    {
        int newHealth = this.health - damage;
        if(newHealth > 0)
        {
           this.health = newHealth;
        }
        else
        {
            this.health = 0;
        }
    }
}
