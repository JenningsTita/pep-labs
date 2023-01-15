
/**
 * This class contains two constructors, but currently the constructors have no behavior,
 * which causes the tests to fail.
 *
 * The first constructor should take in a player's name, and set the Player object's playerName to the parameter.
 * Consider leveraging the 'this' keyword. Since a level is not provided, the constructor should also
 * set the player's level to 1 by default.
 *
 * The second constructor will use a player's name and level to set the Player object's respective field.
 *
 * These constructors would be called to instantiate the object as seen is a previous lab:
 *      Player newPlayer = new Player("Mario");
 *      Player newPlayer = new Player("Mario", 35);
 **/
public class Player {
    public String playerName;
    public int level;

    public Player(String playerName){
        this.playerName = playerName; 
        this.level = 1; 
    }

    /**
     * Again, the values of this object should be set with the help of the 'this' keyword to avoid confusion between
     * class fields / parameter variables.
     *
     * this.playerName should be set to playerName. this.level should be set to level.
     *
     * You may notice that this constructor has the same name as the first constructor. This is allowed, so long as
     * Java is able to differentiate between the constructors using different parameter types. This is referred to as
     * constructor overloading.
     *
     * @param playerName the name of the player to be created.
     * @param level the starting level of the player to be created.
     */
    public Player(String playerName, int level){
this.playerName = playerName;
this.level = level;
    }

}
