import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class Main {
    public static void main(String[] args) {



        Hero wizard = new Hero(100, "magican", 35);
        System.out.println("Wizard health: " + wizard.getHealth() + " attackType: " + wizard.attackType + " damage: " + wizard.getDamage());

        Hero Golem = new Hero( 100, 50);
        System.out.println("Golem health: " + Golem.getHealth() + " damage: " + Golem.getDamage());

        Boss Jim = new Boss(150, 700, "Critical Damage " );
        System.out.println("Boss Damage: " + Jim.getBossDamage() + " Health: " + Jim.getBossHealth() + " Attack Type:" + Jim.getBossAttackType());
    }

}