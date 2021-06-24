import java.util.ArrayList;
import java.util.Scanner;

public class MonsterTester {

    public static void main(String[] args) {

        // scanner variable for input
        Scanner sc = new Scanner(System.in);

        // variables to track / store user input changes
        int newId;
        String newName;
        String newType;
        String newRace;
        int newAttack;
        int newDefence;
        int newLevel;
        int userSelection = 1;
        int userSelectedPlayerID;

        // Monster ArrayList
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Monster(1, "Bahjeera", "Warrior", "Human", 22, 12, 1));
        monsters.add(new Monster(2, "Xaryu", "Mage", "Undead", 15, 10, 1));
        monsters.add(new Monster(3, "Pikaboo", "Rogue", "Undead", 18, 16, 1));
        monsters.add(new Monster(4, "Supaad", "Druid", "Tauren", 14, 22, 1));
        monsters.add(new Monster(5, "Chanimal", "Warlock", "Troll", 25, 9, 1));
        monsters.add(new Monster(6, "Chased", "Priest", "Dwarf", 8, 20, 1));

        // User Menu
        do {
            System.out.println("***********************************");
            System.out.println("Please Select One Of The Following");
            System.out.println("1. Show all players");
            System.out.println("2. Create a new Player");
            System.out.println("3. Edit player");
            System.out.println("0. Exit");
            System.out.println("***********************************");


            userSelection = sc.nextInt();

            // Option 1: Display All players
            if (userSelection == 1) {
                System.out.println("All Users:");

                for (Monster monster : monsters) {
                    System.out.println("PLayerID: " + monster.getId() + "\t Name: " + monster.getName() + "\t  Race: " + monster.getRace() + "\t Type: " + monster.getType() + "\t Attack: " + monster.getAttack() + "\t Defence: " + monster.getDefence() + " Level: " + monster.getCurrentLevel());
                }
            }

            // Option 2: Add new player
            if (userSelection == 2) {
                System.out.println("Please enter name of player: ");
                newName = sc.next();
                System.out.println("Please Race player: ");
                newRace = sc.next();
                System.out.println("Please Type of player: ");
                newType = sc.next();
                System.out.println("Please Attack of player: ");
                newAttack = sc.nextInt();
                System.out.println("Please Defence of player: ");
                newDefence = sc.nextInt();
                System.out.println("Please Level of player: ");
                newLevel = sc.nextInt();

                // set ID of new player with size of monster array + 1
                // this way ID's are in numerical order
                newId = monsters.size() + 1;
                // add new monster with user input variables
                // not sure how i would use the setter methods in this case?
                monsters.add(new Monster(newId, newName, newType, newRace, newAttack, newDefence, newLevel));
            }

            // Option 3: Edit a player
            if (userSelection == 3) {
                System.out.println("Please enter player ID");
                userSelectedPlayerID = sc.nextInt() - 1;

                System.out.println("You have selected " + monsters.get(userSelectedPlayerID).getName());
                System.out.println("Select one of the follow changes");
                System.out.println("1: + Attack");
                System.out.println("2: + Defence");
                System.out.println("3: + Level");

                userSelection = sc.nextInt();
                if (userSelection == 1){
                    monsters.get(userSelectedPlayerID).addAttack();
                    System.out.println(monsters.get(userSelectedPlayerID).getName() + " attack has been updated to " + monsters.get(userSelectedPlayerID).getAttack());
                }else if (userSelection == 2){
                    monsters.get(userSelectedPlayerID).addDefence();
                    System.out.println(monsters.get(userSelectedPlayerID).getName() + " defence has been updated to " + monsters.get(userSelectedPlayerID).getDefence());
                }else if (userSelection == 3)
                {
                    monsters.get(userSelectedPlayerID).levelUp();
                    System.out.println(monsters.get(userSelectedPlayerID).getName() + " has leveled to " + monsters.get(userSelectedPlayerID).getCurrentLevel());
                    System.out.println(monsters.get(userSelectedPlayerID).getName() + " attack has been increased to " + monsters.get(userSelectedPlayerID).getAttack());
                    System.out.println(monsters.get(userSelectedPlayerID).getName() + " defence has been increased to " + monsters.get(userSelectedPlayerID).getDefence());
                } else {
                    System.out.println("This is not a valid selection");
                }
            }

            // Exit program
            if (userSelection == 0) {
                System.out.println("Thank you for playing!");
            }

            if (userSelection >= 4){
                System.out.println("This is not a valid choice");
            }
        } while (userSelection != 0);
    }
}
