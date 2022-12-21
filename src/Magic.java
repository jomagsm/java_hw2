public class Magic extends Hero {

    @Override
    public void applySuperAbility() {
        System.out.println("🪄" + Color.YELLOW + " Magic" + Color.RESET + " applied a superpower " + Color.RED
                + "CRITICAL DAMAGE" + Color.RESET);
    }
}
