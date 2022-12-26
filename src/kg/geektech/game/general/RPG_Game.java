package kg.geektech.game.general;

import kg.geektech.game.playes.*;

import java.util.Random;

public class RPG_Game {
    private static int roundCounter;
    public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss(3000, 50, "Dragon");
        Warrior warrior = new Warrior(270, 10, "Arnold");
        Medic doc = new Medic(250, 5, 15, "Aibolit");
        Magic magic = new Magic(260, 15, "Andriy");
        Berserk berserk = new Berserk(280, 10, "Harold");
        Medic assistant = new Medic(300, 5, 5, "Kevin");
        Thor thor = new Thor(250, 10, "Son of Odin");
        Golem golem = new Golem(1000, 5, "Stone Hero");
        Witcher witcher = new Witcher(300, "The Witcher");
        Hero[] heroes = { warrior, doc, magic, berserk, assistant, thor, golem, witcher };

        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND " + roundCounter + " -----------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundCounter++;
        boss.chooseDefence(heroes);
        if (boss.isStunned()) {
            System.out.println("Boss is condemned and cannot attack");
        } else {
            boss.hit(heroes);
        }
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getDefence() != heroes[i].getAbility() && heroes[i].getHealth() > 0
                    && boss.getHealth() > 0) {
                heroes[i].hit(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    public static Hero getGolem(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero instanceof Golem) {
                return hero;
            }
        }
        return null;
    }
}
