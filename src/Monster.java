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
    /*
      Getter methods for Monster object
    */
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

    /*
        Setter methods for Monster Class
    */
    public void setMyName(String newName) {
        myName = newName;
    }

    public void setMyType(String newType) {
        myType = newType;
    }

    public void setMyRace(String newRace) {
        myRace = newRace;
    }

    public void setAttack(int newAttack) {
        currentAttack = newAttack;
    }

    public void setDefence(int newDefence) {
        currentDefence = newDefence;
    }

    public void setLevel(int setLevel) {
        currentLevel = setLevel;
    }

    /*
        Setter methods to update attributes
    */
    public void levelUp() {
        currentLevel++;
        currentAttack += 3;
        currentDefence += 5;
    }

    public void addAttack(int changeAttack) {
        currentAttack += changeAttack;
    }

    public void addDefence(int changeDefence) {
        currentDefence += changeDefence;
    }
}


