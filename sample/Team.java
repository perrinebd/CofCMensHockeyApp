/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import java.util.ArrayList;

/**
 * This class has two ArrayLists, one of type Player (teamRoster) and the other of type OrgMember (staff).
 * The seperation allows for a Player to be part of staff as well as Coach.
 * @author Brett
 */
public class Team {
    private ArrayList<Player> teamRoster;
    private ArrayList<OrgMember> staff;
    private int wins;
    private int losses;
    private int ties;
    private int gamesPlayed;

    /**
     * Empty constructor just creates an instance of both teamRoster <Player> and staff <OrgMember>
     */
    public Team()
    {
        teamRoster = new ArrayList();
        staff = new ArrayList();
    }

    /**
     * Creates an instance of Team with an ArrayList of Type player and adds the param to the roster
     * @param player - the player to add to the team
     */
    public Team(Player player)
    {
        this.teamRoster = new ArrayList<>();
        teamRoster.add(player);
    }

    /**
     * Creates a Team that is comprised of the param
     * @param players ArrayList of type Player that will comprise the roster
     */
    public Team(ArrayList<Player> players)
    {
        this.teamRoster = players;
        
    }

    /**
     * Creates an ArrayList of OrgMembers and adds the param to the ArrayList
     * @param member - the member to be added to the staff ArrayList
     */
    public Team(OrgMember member)
    {
        this.staff = new ArrayList<>();
        staff.add(member);
    }
    
    /**
     *
     * @param player is an OrgMember of type Player to add to the ArrayList 
     * of type Team
     */
    public void addPlayer(Player player)
    {
        getTeamRoster().add(player);
    }
    
    /**
     *
     * @param coach is an OrgMember of type Coach to add to the ArrayList of
     * type Team
     */
    public void addCoach(Coach coach)
    {
        getStaff().add(coach);
    }
    
    /**
     * Adds a Staff object to the ArrayList staff
     * @param member - the OrgMember you wish to add to staff
     */
    public void addStaff(Staff member)
    {
        getStaff().add(member);
    }

    /**
     * adds an OrgMember object to the ArrayList staff
     * @param member - the OrgMember you wish to add to staff
     */
    public void addOrgMember(OrgMember member)
    {
        getStaff().add(member);
    }

    /**
     * @return ArrayList of type OrgMember
     */
    public ArrayList<OrgMember> getStaff()
    {
        return staff;
    }

    /**
     * Returns the player at their index in ArrayList roster
     * @param index - the index of the particular player the roster
     * @return player at index
     */
    public Player getPlayer(int index)
    {
        return teamRoster.get(index);
    }

    /**
     * @param index - index of the particular OrgMember in staff
     * @return OrgMember at index
     */
    public OrgMember getOrgMember(int index)
    {
        return staff.get(index);
    }

    /**
     * @return ArrayList of type Player
     */
    public ArrayList<Player> getTeamRoster() {
        return teamRoster;
    }

    /**
     * Sets the ArrayList of type Player teamRoster to the param
     * @param teamRoster the new roster
     */
    public void setTeamRoster(ArrayList<Player> teamRoster) {
        this.teamRoster = teamRoster;
    }

    /**
     * @return the number of wins CofC has
     */
    public int getWins() {
        return wins;
    }

    /**
     * @param wins CofC's number of wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * @return the number of losses CofC has
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @param losses the number of CofC's losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * @return the number of ties CofC has
     */
    public int getTies() {
        return ties;
    }

    /**
     * @param ties the number of ties CofC has
     */
    public void setTies(int ties) {
        this.ties = ties;
    }

    /**
     * @return the number of games the team has played
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the number of games played to set
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     *
     * @return int that is the size of the CofC's roster.
     */
    public int size()
    {
        int size = teamRoster.size();
        return size;
    }
    
    public String toString()
    {
        return teamRoster.toString() + staff.toString();
    }
}
