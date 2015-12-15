/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
/**
 * OrgMember is the super class for Player, Coach and Staff. It is mainly comprised of the members position
 * within the organization, the members name, their student ID and graduation year (except in the instance of Coach).
 * @author Brett Perrine
 */
public class OrgMember
{
    private String firstName;
    private String lastName;
    private String position;
    private final String NAME;
    private int studentID;
    private int gradYear;

    /**
     * Creates an OrgMember object
     * @param name - the full name of the person to be created
     * @param pos - position within the oganization
     * @param gY - the graduation year of the student
     * @param sID - studentID number
     */
    public OrgMember(String name, String pos, int gY, int sID)
    {
        this.NAME = name;
        this.position = pos;
        this.gradYear = gY;
        this.studentID = sID;
    }
  
    /**
     * Creates an OrgMember Object
     * 
     * @param fN - first name of the OrgMember
     * @param lN - last name of the OrgMember
     * @param pos - position of the OrgMember
     * @param gY - Graduation year of the OrgMember
     * @param sID - student ID number of the OrgMember
     * @throws IllegalArgumentException if the position isn't forward, coach, manager, defense or goalie.
     * @throws IllegalArgumentException if the graduation year isn't between 2015-2019
     */
    public OrgMember (String fN, String lN, String pos, int gY, int sID)
    {
        try
        {
        if (gY > 2019 || gY < 2015)
            throw new IllegalArgumentException();
        this.gradYear = gY;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "Graduation years"
                             + " must fall between 2015-2019.");
            this.gradYear = 2019; // default 
        }
        
        try
        {
        if (! "defense".equalsIgnoreCase(pos) && ! "forward".equalsIgnoreCase(pos)
                && ! "manager".equalsIgnoreCase(pos) && ! "coach".equalsIgnoreCase(pos)
                && !"goalie".equalsIgnoreCase(pos))
            throw new IllegalArgumentException();
        
            this.position = pos;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "Positions must be"
                             + " Manager, Coach, Forward, Defense or Goalie.");
            this.gradYear = 2019; // default 
        }
        this.studentID = sID;
        this.NAME = fN + " " + lN;
    }
    
    /**
     * Creates a basic OrgMember object to be used in the Coach constructor
     * @param fN - first name of OrgMember
     * @param lN - last name of OrgMember
     * @param pos - OrgMembers position within the Organization
     * @throws IllegalArgumentException if the position isn't forward, coach, manager, defense or goalie.
     */
    public OrgMember (String fN, String lN, String pos)
    {
        this.NAME = fN + " "+ lN;
        
        if (! "defense".equalsIgnoreCase(pos) && ! "forward".equalsIgnoreCase(pos)
                && ! "manager".equalsIgnoreCase(pos) && ! "coach".equalsIgnoreCase(pos)
                && !"goalie".equalsIgnoreCase(pos))
            throw new IllegalArgumentException("That isn't a valid position!");
        
        this.position = pos;
    }

    /**
     * Gets the first name of the OrgMember
     * @return the OrgMember's firstName
     */
    public String getFirstName() 
    {
        return firstName;
    }

    /**
     *  Gets the last name of the OrgMember
     * @return the OrgMember's lastName
     */
    public String getLastName() 
    {
        return lastName;
    }

    /**
     * gets the full name of the OrgMember
     * @return the OrgMembers full name
     */
    public String getName()
    {
        return NAME;
    }
    
    /**
     * Gets the OrgMembers position within the organization
     * @return the OrgMember's position
     */
    public String getPosition() 
    {
        return position;
    }

    /**
     * Sets the OrgMembers new position
     * @param pos the position to set
     * @throws IllegalArgumentException if the position isn't forward, coach, manager, defense or goalie.
     */
    public void setPosition(String pos) 
    {
        try{
        if (! "defense".equalsIgnoreCase(pos) && ! "forward".equalsIgnoreCase(pos)
                && ! "manager".equalsIgnoreCase(pos) && ! "coach".equalsIgnoreCase(pos)
                && !"goalie".equalsIgnoreCase(pos))
            throw new IllegalArgumentException("That is not a valid position");
           this.position = pos;
        }
        catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + "Positions must be"
                    + " Manager, Coach, Forward, Defense or Goalie.");
        }
    }

    /**
     * Sets the ID number to the student
     * @param sID - the students ID number
     */
    public void setStudentID(int sID) {this.studentID = sID;}
    /**
     *  Gets the student ID number
     * @return the OrgMember's studentID number
     */
    public int getStudentID() 
    {
        return studentID;
    }

    /**
     *  Gets the graduation year of the OrgMember
     * @return the OrgMember's graduation year
     */
    public int getGradYear() 
    {
        return gradYear;
    }

    /**
     *  Sets the graduation year of the OrgMember to the param.  
     * @param gY the gradYear to set
     * @throws IllegalArgumentException if param isn't between 2015-2019
     */
    public void setGradYear(int gY)
    {
        try{
            if (gY > 2019 || gY < 2015)
                throw new IllegalArgumentException();
            this.gradYear = gY;
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("IllegalArgumentException: " + "Valid graduation "
                    + " years fall between 2015 - 2019");
        }
    }

    @Override
    public String toString()
    {
        String memberInfo = "Name: " + NAME + " | Student ID: " + getStudentID() +
                " | Graduation Year: " + getGradYear() +
                " | Position: " + getPosition();

        return memberInfo + "\n";
    }
}