/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *Coach is a specific OrgMember which only exists in one instance.  The coach will have only his name and position
 * from the super class.
 * @author Brett Perrine
 */
public class Coach extends OrgMember {

    private int wins;
    private int losses;
    private int games;
    private String previousTeam;

    /**
     * Constructs an OrgMember object of type Coach which represents the head
     * coach of the team.
     *
     * @param fN    - first name of the Coach
     * @param lN    - last name of the coach
     * @param prevT - Coach's previous team
     */
    public Coach(String fN, String lN, String prevT) {
        super(fN, lN, "Coach");
        this.wins = 0;
        this.losses = 0;
        this.games = 0;
        this.previousTeam = prevT;
    }

    /**
     * Allows all coach statistics to be updated at once, all of the params must be positive
     *
     * @param w - number of wins the coach has
     * @param l - number of losses the coach has
     * @param g - number of games total the coach has competed in
     */
    public void setStats(int w, int l, int g) {
        try {
            if (w < 0 || l < 0 || g < 0)
                throw new IllegalArgumentException();
            this.wins = w;
            this.losses = l;
            this.games = g;
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + "You must enter"
                    + " positive integers for game statistics!");
        }
    }

    /**
     * get the position of the Coach which will always be Coach
     * @return "Coach"
     */
    public String getPostition() {return "Coach";}

    /**
     * Gets the number of wins the coach has
     *
     * @return the coach's wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Sets the number of wins the coach has, must be a positive number
     *
     * @param w - number of wins the coach has
     */
    public void setWins(int w) {
        try {
            if (w < 0) // catches a negative goal integer value
                throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + "You must enter a "
                    + "positive integer for wins!");
        }
        this.wins = w;
    }

    /**
     * Gets the number of losses the coach has
     *
     * @return the coach's losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Sets the number of losses the coach has to be positive.
     *
     * @param l - number of losses the coach has
     */
    public void setLosses(int l) {
        try {
            if (l < 0) // catches if number of losses is less than zero
                throw new IllegalArgumentException();
            this.losses = l;
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + "You must enter a "
                    + "positive integer for losses!");
        }
    }

    /**
     * Gets the number of games the coach has competed in
     *
     * @return the coach's total games
     */
    public int getGames() {
        return games;
    }

    /**
     * Sets the number of games the coach has, must be positive
     *
     * @param g - number of games the coach has competed in
     */
    public void setGames(int g) {
        try {
            if (g < 0)
                throw new IllegalArgumentException();
            this.games = g;
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + "You must enter a "
                    + "positive integer for Games Played!");
        }
    }

    /**
     * Gets the name of the coach's previous team
     *
     * @return the Coach's previous team name
     */
    public String getPreviousTeam() {
        return previousTeam;
    }

    /**
     * Sets the previous team for the coach
     *
     * @param pT is a String containing the name of the coaches prior team.
     */
    public void setPreviousTeam(String pT) {
        this.previousTeam = pT;
    }

    @Override
    public String toString() {
        String output = " | Coach | " + "Name: " + getName() +
                " | Previous Team: " + getPreviousTeam() +
                " | Games: " + getGames() + " | Wins: " + getWins() +
                " | Losses: " + getLosses() + "\n";

        return output;
    }
}
