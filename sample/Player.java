/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
/**
 * Player is a subclass of OrgMember which has parameters for most aspects of a Player i.e. height weight as well
 * as statistic aquired during gameplay.
 * @author Brett 
 */
public class Player extends OrgMember{
    private String shot;
    private int inches;
    private int feet;
    private int playerNum;
    private int weight;
    private int gamesPlayed;
    private int goals;
    private int assists;
    private int penaltyMinutes;
    
    /**
     * Creates a Player object comprised of the Minimum requirements but 
     * First and Last name seperated during input.
     *
     * @param fN OrgMember first name
     * @param lN OrgMember last name / together they make OrgMember name
     * @param pos OrgMmeber position / player position or Org position
     * @param gY OrgMember graduation year
     * @param sID   OrgMember studentID number 
     * @param num Players number
     */
    public Player(String fN, String lN, String pos, int num, int gY, int sID)
    {

        super(fN,lN, pos, gY, sID);
        if (num <=0 || num >= 100)
            throw new IllegalArgumentException();
        this.playerNum = num;
        
    }

    /**
     * Creates an OrgMember object of type Player
     * @param name - the full name of the player
     * @param pos - the position of the player
     * @param num - players game number
     * @param gY - players graduation year
     * @param sID - players studentID number
     */
    public Player(String name, String pos, int num, int gY, int sID)
    {
        super(name, pos, gY, sID);
        this.playerNum = num;
    }
    /**
     *  Creates a Player object with just the name and position.  Mainly used for reconstructing objects from the
     *  reader class.
     *  
     * @param name the Players full name
     * @param pos the Players game position
     */
    public Player(String name, String pos)
    {
        super(name, pos, 00, 2006000);
        this.playerNum = 0;
    }
    
    /**
     * Creates a complete Player object with statistics
     * 
     * @param firstName OrgMember first name
     * @param lastName OrgMember last name / together they make OrgMember name
     * @param position OrgMmeber position / player position
     * @param gradYear OrgMember graduation year
     * @param studentID   OrgMember studentID number 
     * @param w Player's weight
     * @param shot the direction the Player shoots, either R (Right) or L (Left)
     */
    public Player(String firstName,String lastName, String position, int num, int gradYear, int studentID, int hF, int hI, int w,
                 String shot)
    {
        
        super(firstName,  lastName,  position,
             gradYear, studentID);
        try{
        if (num < 0 || num > 99)
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "only integers "
                            +  " between 1-99 are valid!");
            this.playerNum = 0;
        }
        try{
        if(hF < 0 || hF > 8)        
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "Only integers "
                              + "between 0-8 are valid for feet!");
            feet = 0;
        }
        try{
        if(hI < 0 || hI > 12)
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "Anything over 11 "
                             + "would be another foot!");
            inches = 0;
        }
        try{
        if(w < 0 || w > 1000)
           throw new IllegalArgumentException("Weight cannot be negative.. or"
                                            +" maybe your entry it too high! ");                                           
        }
        catch (IllegalArgumentException e )
        {
            System.err.println("IllegalArgumentExeption: " + "Only positive"
                             + " integers <1000 are valid!");
            weight = 0;
        }
        
        feet = hF;
        inches = hI;
        this.weight = w;
        this.shot = shot;
        this.playerNum = num;
        
        
        
    }
    /**
     * Sets the game statistics for the player
     * 
     * @param gP games the player has played
     * @param g goals the player has scored
     * @param a assists the player has acquired
     * @param pims penalty minutes the player has acquired.
     */
    public void setStats(int gP,int g, int a, int pims)
    {

        this.gamesPlayed = gP;
        this.goals = g;
        this.assists = a;
        this.penaltyMinutes = pims;
    }
    
    /**
     * Sets the players number of feet (height)
     * 
     * @param ft is the number of feet tall the player is
     */
    public void setFeet(int ft)
    {
        feet = ft;
    }
    
    /**
     * Gets the number of feet tall the player is
     * @return Player height as a string
     */
    public int getFeet()
    {
        return feet;
    }

    /**
     * Returns the number of inches (ex. 6'1" returns 1)
     *
     * @return the players inches in height
     */
    public int getInches() {
        return inches;
    }

    /**
     * Sets the number of inches to the player object.
     *
     * @param inches - the inches to set
     * @throws IllegalArgumentException if number is negative or greater than 11
     */
    public void setInches(int inches) {
        if (inches < 0 || inches > 12)
            throw new IllegalArgumentException();

        this.inches = inches;
    }

    /**
     * Gets the weight of the player
     * @return the weight
     */
    public int getWeight() 
    {
        return weight;
    }

    /**
     * Sets the players weight to the integer parameter
     * @param weight the weight to set for the Player
     */
    public void setWeight(int weight) 
    {
        this.weight = weight;
    }

    /**
     * Gets the players shot hand
     * @return the shothand of the player
     */
    public String getShot() 
    {
        return shot;
    }

    /**
     * Sets the shot hand of the player
     * @param shot the shot to set
     */
    public void setShot(String shot) 
    {
        this.shot = shot;
    }

    /**
     * Gets the number of gamed played by the player
     * @return the games played by the player
     */
    public int getGamesPlayed() 
    {
        return gamesPlayed;
    }

    /**
     * Sets the players number of games played to param
     * @param gamesPlayed the number of games the player played to set
     */
    public void setGamesPlayed(int gamesPlayed) 
    {
        this.gamesPlayed = gamesPlayed;
    }
    
    /**
     *
     * @param numGames to add to the Player's existing total of games played
     */
    public void addGamesPlayed(int numGames)
    {
        this.gamesPlayed += numGames;
    }

    /**
     * Gets the number of goals scored by the player
     * @return the number of goals scored by the player
     */
    public int getGoals() 
    {
        return goals;
    }

    /**
     *Sets the number of goals scored by the player
     * @param goals the players number of goals to set
     */
    public void setGoals(int goals) 
    {
        this.goals = goals;
    }
    
    /**
     *Add's the param to the number of goals the player already has.
     * @param goal number of goals to add to Player's goal total
     */
    public void addGoals(int goal)
    {
        this.goals += goal;
    }

    /**
     * Gets the number of assists the player has
     * @return the players number of assists
     */
    public int getAssists() 
    {
        return assists;
    }

    /**
     * @param assists the plaeyrs number of assists to set
     */
    public void setAssists(int assists) 
    {
        this.assists = assists;
    }
    
    /**
     *  Add's the number of assists to the already existing number of assists for the player.
     * @param assist number of assist to add to Player's assist total
     */
    public void addAssist(int assist)
    {
        this.assists += assist;
    }

    /**
     * @return the Player's number of penalty minutes
     */
    public int getPenaltyMinutes() 
    {
        return penaltyMinutes;
    }

    /**
     * @param penaltyMinutes the players number of penalty minutes to set
     */
    public void setPenaltyMinutes(int penaltyMinutes) 
    {
        this.penaltyMinutes = penaltyMinutes;
    }
    
    /**
     * Adds an integer onto the existing number of penalty minutes the player
     * has.
     * @param pM the number of penalty minutes to add to the players total
     */
    public void addPenaltyMinutes(int pM)
    {
        this.penaltyMinutes += pM;
    }
    
    /**
     * Gets the player's game number
     * 
     * @return the players game (jersey) number
     */
    public int getPlayerNum() 
    {
        return playerNum;
    }

    /**
     * Set the players game number
     * @param pN the player's nummber to set
     */
    public void setPlayerNum(int pN) 
    {
        this.playerNum = pN;
    }

    @Override
    public String toString()
    {
        String nameString = "Name: " + super.getName();
        String heightString = " | Height: " + feet + "'" + inches + "\"";
        String weightString = " | Weight: " + weight;
        String numString = " | Number: " + playerNum;
        String shotString = " | Shot: " + shot;
        String gPString = " | Games Played: " + gamesPlayed;
        String goalString = " | Goals: " + goals;
        String assistString =  " | Assists: " + assists;
        String outcomeString = " | PIMS: " + penaltyMinutes;
        
        String playerInfo = nameString + numString + heightString +  
                            weightString + shotString + gPString 
                             + goalString + assistString + outcomeString;
        
        return "Player Info: " + playerInfo + "\n";
    }
}
