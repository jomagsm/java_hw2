package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean choice = RPG_Game.random.nextBoolean();
        boss.setStunned(choice);
        if (choice) {
            System.out.println("Thor took a super hit and stunned Boss");
        } else {
            System.out.println("Thor took a super shot but missed.");
        }
    }
}
