public class Hero {
    private int health;
    String attackType;
    private int damage;

    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return  damage;
    }

    public Hero(int thehealth, String theattackType, int thedamage) {
        health = thehealth;
        attackType = theattackType;
        damage = thedamage;
    }
    public Hero(int health, int damage){
        this.health =  health;
        this.damage = damage;
    }

}