package kg.geektech.game.playes;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    }
}
