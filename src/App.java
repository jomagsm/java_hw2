
public class App {
    public static void main(String[] args) throws Exception {
        Boss boss = new Boss();
        boss.setHealth(2000);
        boss.setDamage(50);
        boss.setBossDefense("Physical");
        boss.printBossInfo();
        Hero[] heroArray = createHeroes();
        for (Hero hero : heroArray) {
            hero.printHeroInfo();
        }
    }

    public static Hero[] createHeroes() {
        Hero[] array = { new Hero(200, 10), new Hero(150, 15, "Physical"), new Hero(200, 10, "Magical") };
        return array;
    }
}
