/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample;

/**
 *Game objects represent a game between CofC and an opponent.  The games will be used to keep track of team wide
 * statistics ie goals for and against.  The game objects will populate an ArrayList in class Schedule.
 * @author Brett Perrine
 */
public class Game {
	/*
	 * hello world
	 */
    
    private String opponent;
    private String day;
    private String location;
    private String gameTime;
    private int goalsFor;
    private int goalsAgainst;
    private String outcome;
    private int gameNum;
    
    /**
     * Constructs an instance of type Game that would be in the past, therefore results will be entered as well.
     * @param opponent - Name of the opposing team
     * @param location - Location in which the game is taking place
     * @param day - the date of the game
     * @param gameTime - The start time of the game
     * @param gF - Goals scored by C of C, must be positive.
     * @param gA - Goals scored by opposing team, must be positive.
     * @param outcome - Win, Loss, Tie or Postponed
     */
    public Game(String opponent, String location, String day, String gameTime, 
                 int gF, int gA, String outcome)
    {
        
        if (gF < 0)
                throw new IllegalArgumentException("goalsFor cannot be a "
                                                    + "negative integer...");
        if (gA < 0)
                throw new IllegalArgumentException("This cannot be a "
                                                    + "negative integer...");
        this.opponent = opponent;
        this.location = location;
        this.day = day;    
        this.gameTime = gameTime;
        this.goalsFor = gF;
        this.goalsAgainst = gA;
        this.outcome = outcome;
        this.gameNum = 0;
    }
    
    /**
     * Constructs an instance of type game that hasn't happened yet
     * @param opponent - name of the opponent
     * @param location - location of the game
     * @param day - date of the game
     * @param gameTime - the start time of the game
     */
    public Game(String opponent, String location, String day, String gameTime)
    {
        this.opponent = opponent;
        this.location = location;
        this.day = day;    
        this.gameTime = gameTime;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
        this.outcome = "N/A";
   
    }

    /**
     * @return the opponent's name
     */
    public String getOpponent() 
    {
        return opponent;
    }

    /**
     * @return the day of the game
     */
    public String getDay() 
    {
        return day;
    }

    /**
     * @return the location of the game
     */
    public String getLocation() 
    {
        return location;
    }

    /**
     * @return the game's start time
     */
    public String getGameTime() 
    {
        return gameTime;
    }

    /**
     * @param opponent the opponent's name to set
     */
    public void setOpponent(String opponent) 
    {
        this.opponent = opponent;
    }

    /**
     * @param day the day of the game to set
     */
    public void setDay(String day) 
    {
        this.day = day;
    }

    /**
     * @param location the location of the game to set
     */
    public void setLocation(String location) 
    {
        this.location = location;
    }

    /**
     * @param gameTime the starting time of the game to set
     */
    public void setGameTime(String gameTime) 
    {
        this.gameTime = gameTime;
    }

    /**
     * @param outcome the outcome of the game to set
     */
    public void setOutcome(String outcome) 
    {
        this.outcome = outcome;
    }

    /**
     * @return the goals scored by CofC
     */
    public int getGoalsFor() 
    {
        return goalsFor;
    }
    /**
     * @return the outcome of the game
     */
    public String getOutcome()
    {
        return outcome;
    }

    /**
     * Sets the number of goals scored by CofC, throws IllegalArgumentException
     * if negative number is input.
     * @param gF the goals scored by CofC to set
     */
    public void setGoalsFor(int gF) 
    {
        if (gF < 0)
                throw new IllegalArgumentException("goalsFor cannot be a "
                                                    + "negative integer...");
        this.goalsFor = gF;
    }

    /**
     * @return the goals scored against CofC during the game
     */
    public int getGoalsAgainst() 
    {
        return goalsAgainst;
    }

    /**
     * Gets the number of goals scored against CofC, throws IllegalArgumentException
     * is a negative number is input.
     * @param gA the goals scored by the opponent from the game to set
     */
    public void setGoalsAgainst(int gA) 
    {
        if (gA < 0)
                throw new IllegalArgumentException("This cannot be a "
                                                    + "negative integer...");
        this.goalsAgainst = gA;
    }

    /**
     * Sets all the statistics for a given game, throws IllegalArgumentException
     * if goalsFor and goalsAgainst are negative.
     * @param goalsFor - goals scored by college of charleston
     * @param goalsAgainst - goals scored against College of Charleston
     * @param outcome - The outcome of the game (Win, Loss, Tie, Postponed)
     */
    public void setGameStats(int goalsFor, int goalsAgainst, String outcome)
    {
        if (goalsFor < 0)
                throw new IllegalArgumentException("goalsFor cannot be a "
                                                    + "negative integer...");
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.outcome = outcome;
    }
    
    @Override
    public String toString()
    {
        String opponentString = "Opponent: " + getOpponent();
        String locationString = " | Location: " + getLocation();
        String dayString = " | Day: " + getDay();
        String gameTimeString = " | Time: " + getGameTime();
        String goalsForString = " | GF: " + getGoalsFor();
        String GoalsAgainstString = " | GA:" + getGoalsAgainst();
        String outcomeString = " | Winner: " + getOutcome();

        String currentGame =  (opponentString + locationString  + dayString
                              + gameTimeString + goalsForString 
                              + GoalsAgainstString + outcomeString);
        
            return "Game Info: || " + currentGame + "\n";
    }
}
