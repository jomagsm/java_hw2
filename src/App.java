import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int age = generateRandomAge();
        System.out.println("AGE: "+ age + " TEMP: 30 " + getWalkText(age, 30));
        age = generateRandomAge();
        System.out.println("AGE: "+ age + " TEMP: -1 " + getWalkText(age, -1));
        age = generateRandomAge();
        System.out.println("AGE: "+ age + " TEMP: -20 " + getWalkText(age, -20));
        age = generateRandomAge();
        System.out.println("AGE: "+ age + " TEMP: -10 " + getWalkText(age, -10));
        age = generateRandomAge();
        System.out.println("AGE: "+ age + " TEMP: 5 " + getWalkText(age, 5));
    }

    public static String getWalkText(int age, double temp) {
        final String goWalk = "You can go for a walk " + '\u2713';
        final String stayAtHome = "Stay at home " + '\u2716';
        if (inRange(age, 20, 45) && inRange(temp, -20, 30)) {
            return goWalk;
        } else if (age < 20 && inRange(temp, 0, 28)) {
            return goWalk;
        } else if (age > 45 && inRange(temp, -10, 25)) {
            return goWalk;
        }
        return stayAtHome;
    }

    public static boolean inRange(double value, double start, double finish) {
        return value >= start && value < finish;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int range = 100 - 1 + 1;
        return random.nextInt(range) + 1;
    }
}
