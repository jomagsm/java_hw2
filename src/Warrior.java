public class Warrior extends Hero {

    @Override
    public void applySuperAbility() {
        System.out.println("⚔️" + Color.YELLOW + " Warrior" + Color.RESET + " applied a superpower " + Color.RED
                + "CRITICAL DAMAGE" + Color.RESET);
    }
}
