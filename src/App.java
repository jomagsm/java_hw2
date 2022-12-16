
public class App {
    public static void main(String[] args) throws Exception {
        Weapon sword = new Weapon();
        sword.setName("Sword");
        sword.setWeaponType(WeaponType.HAND_TO_HAND_COMBAT_WEAPONS);
        Boss boss = new Boss(2000, 50, sword);
        boss.printInfo();

        Skeleton firstSkeleton = new Skeleton(200, 10, null, 10);
        Skeleton secondSkeleton = new Skeleton(300, 8, null, 8);
        firstSkeleton.printInfo();
        secondSkeleton.printInfo();
    }

    public static Hero[] createHeroes() {
        Hero[] array = { new Hero(200, 10), new Hero(150, 15, "Physical"), new Hero(200, 10, "Magical") };
        return array;
    }
}
