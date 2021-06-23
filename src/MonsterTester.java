import java.util.ArrayList;
import java.util.Scanner;

public class MonsterTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String newName;
        String newType;
        String newRace;
        int newAttack;
        int newDefence;
        int newLevel;
        int changeInAttack;
        int changeInDefence;
        int changeInLevel;
        int userSelection = 1;

        // Monster ArrayList
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Monster("Bahjeera", "Warrior", "Human", 22, 12, 1));
        monsters.add(new Monster("Xaryu", "Mage", "Undead", 15, 10, 1));
        monsters.add(new Monster("Pikaboo", "Rogue", "Undead", 18, 16, 1));
        monsters.add(new Monster("Supatease", "Druid", "Tauren", 14, 22, 1));
        monsters.add(new Monster("Chanimal", "Warlock", "Orc", 25, 9, 1));
        monsters.add(new Monster("Chas", "Priest", "Dwarf", 8, 20, 1));

        // User Menu
        do {
            System.out.println("Please Select One Of The Following");
            System.out.println("1. Show all players");
            System.out.println("2. Create a new Player");
            System.out.println("3. Edit player");
            System.out.println("0. Exit");

            userSelection = sc.nextInt();

            // Display All players
            if (userSelection == 1) {
                System.out.println("All Users:");

                for (Monster monster : monsters) {
                    System.out.println("Name: " + monster.getName() + "  Race: " + monster.getRace() + " Type: " + monster.getType());
                }
            }

            // Add new player
            if (userSelection == 2) {
                System.out.println("Please enter name of player: ");
                newName = sc.next();
                System.out.println("Please Type of player: ");
                newType = sc.next();
                System.out.println("Please Race player: ");
                newRace = sc.next();
                System.out.println("Please Attack of player: ");
                newAttack = sc.nextInt();
                System.out.println("Please Defence of player: ");
                newDefence = sc.nextInt();
                System.out.println("Please Level of player: ");
                newLevel = sc.nextInt();

                monsters.add(new Monster(newName, newType, newRace, newAttack, newDefence, newLevel));
            }

            // Exit program
            if (userSelection == 0) {
                System.out.println("Thank you, Have a great day!");
            }
        } while (userSelection != 0);


    }
}
