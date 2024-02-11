public class Player {

    public String name;
    public int health;
    public String weapon;

    public void losehealth(int damage)
    {
        health = health - damage;
        if (health <= 0)
        {
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining()
    {
        return health;
    }

    public void restorehealth(int extrahealth)
    {
        health = health + extrahealth;
        if (health > 100)
        {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
