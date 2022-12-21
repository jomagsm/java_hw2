public class Medic extends Hero {
    private int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("⚕️" + Color.YELLOW + " Medic" + Color.RESET + " applied a superpower " + Color.RED
                + "CRITICAL DAMAGE" + Color.RESET);
    }

    public void increaseExperience() {
        healPoints = (int) (healPoints + healPoints * 0.1);

        System.out.println("⚕️" + Color.YELLOW + " Medic" + Color.RESET + " Increased experience");
    }
}
