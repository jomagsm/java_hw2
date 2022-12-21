public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private TypeOfSuperPower typeOfSuperPower;
    
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
    public TypeOfSuperPower getTypeOfSuperPower() {
        return typeOfSuperPower;
    }
    public void setTypeOfSuperPower(TypeOfSuperPower typeOfSuperPower) {
        this.typeOfSuperPower = typeOfSuperPower;
    }
}
