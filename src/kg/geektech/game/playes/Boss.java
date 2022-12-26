package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defence;
    private boolean isStunned = false;

    public boolean isStunned() {
        boolean temp = this.isStunned;
        this.isStunned = false;
        return temp;
    }

    public void setStunned(boolean isStunned) {
        this.isStunned = isStunned;
    }

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }

    public void hit(Hero[] heroes) {
        Golem golem = (Golem) RPG_Game.getGolem(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                int damage = this.getDamage();
                if (golem.getHealth() > 0 && golem != null) {
                    damage = (int) (this.getDamage() - this.getDamage() * 0.2);
                    int golemDamageReceived = this.getDamage() - damage;
                    golem.setHealth(golem.getHealth() - golemDamageReceived);
                }
                if (heroes[i] instanceof Berserk) {
                    int oldHealth = heroes[i].getHealth();
                    heroes[i].setHealth(heroes[i].getHealth() - damage);
                    ((Berserk) heroes[i]).setSavedDamage(oldHealth - heroes[i].getHealth());
                } else {
                    heroes[i].setHealth(heroes[i].getHealth() - damage);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BOSS " + super.toString() + " defence: " +
                (this.defence == null ? "No defence" : this.defence);
    }
}
