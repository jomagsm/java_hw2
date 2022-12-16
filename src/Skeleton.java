public class Skeleton extends Boss {
    private int qntArrow;

    public Skeleton(int health,
            int damage, Weapon weapon, int qntArrow) {
        super(health, damage, weapon);
        this.qntArrow = qntArrow;
    }

    public int getQntArrow() {
        return qntArrow;
    }

    public void setQntArrow(int qntArrow) {
        this.qntArrow = qntArrow;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Skeleton health: " + Color.GREEN + this.getHealth() + Color.RESET + " Skeleton damage: "
                        + Color.RED
                        + this.getDamage() + Color.RESET
                        + " Skeleton qnt arrow: "
                        + Color.YELLOW + qntArrow + Color.RESET);
    }
}
