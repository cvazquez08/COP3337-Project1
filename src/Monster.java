/* Author: Christopher Vazquez
This Monster Solution contains all of the instance variables and methods for a monster
*/

public class Monster {
    //private instance variables
    private String myName;
    private String myType;
    private String myRace;
    private int currentAttack;
    private int currentDefence;
    private int currentLevel;

    public Monster(String name, String type, String race, int attack, int defence, int level) {
        myName = name;
        myType = type;
        myRace = race;
        currentAttack = attack;
        currentDefence = defence;
        currentLevel = level;
    }

    //Getter methods for Monster object
    public String getName() {
        return myName;
    }

    public String getType() {
        return myType;
    }

    public String getRace() {
        return myRace;
    }

    public String getRaceAndType() {
        return myRace + " " + myType;
    }

    public int getAttack() {
        return currentAttack;
    }

    public int getDefence() {
        return currentDefence;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}


