public class Hero {
    private int health;
    private int damage;
    private String attackType;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String attackType) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public void printHeroInfo() {
        final String attackType = this.attackType != null ? this.attackType : "No attack type";
        System.out.println(
                "Hero health: " + this.health + " Hero damage: " + this.damage + " Hero attack type: "
                        + attackType);
    }
}
