public class Hero {
    private int health;
    String attackType;
    private int damage;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
   public String getAttackType(){
        return attackType;
   }
    public Hero(int thehealth, String theattackType, int thedamage) {
        health = thehealth;
        attackType = theattackType;
        damage = thedamage;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String attackType) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
    }
}