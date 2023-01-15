public class Boss {

    private int bossHealth;
    private int bossDamage;
    private String bossAttackType;

    public int getBossHealth() {
        return bossHealth;
    }
    public int getBossDamage() {
        return bossDamage;
    }
    public String getBossAttackType() {
        return  bossAttackType;
    }
    public void setBossHealth(int bossHealth) {
        if (bossHealth < 0) {
            System.out.println("Wrong value for bossHealth field");
        } else {
            this.bossHealth = bossHealth;
        }
    }
    public void setBossDamage(int bossDamage) {
        if (bossDamage < 0) {
            System.out.println("Wrong value for bossDamage field");
        } else {
            this.bossDamage = bossDamage;
        }
    }


    public Boss(int bossDamage, int bossHealth, String bossAttackType){
        this.bossAttackType=bossAttackType;
        this.bossDamage=bossDamage;
        this.bossHealth=bossHealth;
    }
}
