public class Boss extends GameEntity {
    public Boss(
            int health,
            int damage, Weapon weapon) {
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.setWeapon(weapon);
    }

    public void printInfo() {
        System.out.println(
                "Boss health: " + Color.GREEN + this.getHealth() + Color.RESET + " Boss damage: " + Color.RED
                        + this.getDamage() + Color.RESET
                        + " Boss weapon: "
                        + Color.BLUE + this.getWeapon().getName() + Color.RESET);
    }
}
