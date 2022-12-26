package kg.geektech.game.playes;

public class Witcher extends Hero {

    public Witcher(int health, String name) {
        super(health, 0, name, SuperAbility.REVITALIZE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && this != heroes[i]) {
                heroes[i].setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println("The Witcher gave his life to the " + heroes[i]);
            }
        }
    }
}
