public class Boss {
    private int health;
    private int damage;
    private String bossDefense;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getBossDefense() {
        return bossDefense;
    }

    public void setBossDefense(String bossDefense) {
        this.bossDefense = bossDefense;
    }

    public void printBossInfo() {
        System.out.println(
                "Boss health: " + this.health + " Boss damage: " + this.damage + " Boss defense: " + this.bossDefense);
    }

}
