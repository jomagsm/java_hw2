
public class App {
    public static void main(String[] args) throws Exception {
        Hero[] heroArrays = createHeroes();
        for (Hero hero : heroArrays) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }

    public static Hero[] createHeroes() {
        Hero[] array = { new Magic(), new Medic(), new Warrior() };
        return array;
    }
}
