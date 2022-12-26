package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    private int savedDamage;

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(5) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() - savedDamage / coefficient);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
