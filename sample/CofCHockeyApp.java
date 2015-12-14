/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

This is an application for the College of Charleston Ice Hockey team

 */
package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Brett Perrine
 */
public class CofCHockeyApp 
{
	
	private TextField textField;
	private TextArea textArea;
	private int stage = 1;
	private int choice = 0;
	
    String lastName = null;
	String firstName =  null;
    String postition = null;
	String name = null;
	
    
    public int getStage() {
    	return stage;
    }
        
    public int getChoice()
    {
    	return choice;
    }
    /**
     * Prints out the numbered menu of options via the console
     */
        public void mainMenu()
    {
        textArea.appendText("\n");
        textArea.appendText("\n-------------------------------------------------");
        textArea.appendText("\nEnter from the following options or -1 to quit. ");
        textArea.appendText("\n\n");
        textArea.appendText("\n1: View Roster ");
        textArea.appendText("\n2: View Schedule ");
        textArea.appendText("\n3: View Staff ");
        textArea.appendText("\n4: Add player ");
        textArea.appendText("\n5: Add Game ");
        textArea.appendText("\n6: Add Staff Member ");
        textArea.appendText("\n7: Update Player Stats");
        textArea.appendText("\n8: Update Game Results");
        textArea.appendText("\n9: Save Roster");
        textArea.appendText("\n10: View Saved Information ");
        textArea.appendText("\n-------------------------------------------------");
        textArea.appendText("\n\n");
    }
   
    /**
     * Creates an empty ArrayList of OrgMember in Team class, populates it with
     * One Staff object and one Coach object.
     * 
     * @return new OrgMember of type Staff created by user input and adds it
     * to the ArrayList Team which is populated by Staff members
     */
    public Team createStaff()
    {
        // new Team object, staff, which can be populated with any OrgMember
        Team staff = new Team(); 
        
        // Default Staff to populate ArrayList
        Staff jordynP = new Staff("Jordyn", "Pursell", 2016, 2000394,
                                    "Score keeper");
        
        // Default Coach to populate ArrayList
        Coach mikeH = new Coach("Dave", "Jarman", "Charleston StingRays");
        
        staff.addStaff(jordynP); // Staff to show up in testing
        staff.addCoach(mikeH); //Coach to show up in testing
        return staff;
    }
   
    /**
     * Creates an ArrayList of Game objects as well as the Game objects to
     * populate the list.
     * 
     * @return an ArrayList of Game objects
     */
    public Schedule createSchedule()
    {
       // Creates a Schedule object that is an ArrayList composed of Game objects
        Schedule schedule = new Schedule();
        
        // Three default Game Objects to populate ArrayList schedule
        Game jW = new Game("Johnson Wales", "Charleston, SC", "09/18/2015", "7:00 PM", 18, 1, "W");
        Game cit = new Game("Citadel", "Charleston, SC", "09/20/2015", "11:00 AM", 5, 2, "Win");
        Game duke = new Game("Duke", "Durham, NC", "09/25/2015", "10:15 PM", 2, 5, "Loss");
        Game duke2 = new Game("Duke", "Durham, NC", "09/26/2015", "3:45 PM", 6, 3, "Win");
        Game ten = new Game("Tennessee", "Charleston, SC", "10/02/2015", "7:00 PM", 0, 0, "Postponed");
        Game uncC = new Game("UNC - Charlotte", "Charleston, SC", "10/04/2015", "10:30 AM", 0, 0, "Postponed");
        Game usc = new Game("University of South Carolina", "Columbia, SC", "10/08/2015", "9:15 PM", 0, 0, "Postponed");
        Game od = new Game("Old Dominion", "Charleston, SC", "10/16/2015", "8:15 PM", 7, 1, "Win");
        Game ccu = new Game("Coastal Carolina Univeristy", "Charleston, SC", "10/16/2015", "7:30 PM", 1, 5, "Loss");
        Game ccu2 = new Game("Coastal Carolina Univeristy", "Charleston, SC", "11/06/2015", "10:30 PM", 5, 4, "Win");
        Game app = new Game("Appilation State University", "Charleston, SC", "11/07/2015", "6:30 PM", 19, 0, "Win");
        Game usc2 = new Game("University of South Carolina", "Columbia, SC", "11/12/2015", "9:30 PM", 3, 7, "Loss");
        Game clem = new Game("Clemson University", "Charleston, SC", "11/13/2015", "9:15 PM", 2, 10, "Loss");
        Game ken = new Game("Kennesaw State University", "Kennesaw, GA", "11/14/2015", "10:10 PM", 5, 9, "Loss");
        Game ecu = new Game("East Carolina University", "Greenville, NC", "11/20/2015", "8:45 PM", 3, 8, "Loss");
        Game ecu2 = new Game("East Carolina University", "Greenville, NC", "11/21/2015", "10:00 AM", 4, 6, "Loss");
        Game uga = new Game("University of Georgia", "Athens, GA", "12/04/2015", "7:30 PM", 3, 15, "Loss");
        Game ecu3 = new Game("East Carolina University", "Charleston, SC", "01/15/2016", "10:00 PM");
        Game gt = new Game("Georgia Tech", "Atlanta, GA", "01/22/2016", "10:00 PM");
        Game life = new Game("Life University", "Marietta, GA", "01/22/2016", "TBD");
        Game life2 = new Game("Life University", "Charleston, SC", "02/05/2016", "8:15 PM");
        Game wf = new Game("Wake Forest University", "Winston-Salem, NC", "02/06/2016", "7:30 PM");
        Game flt = new Game("Florida Tech University", "Melbourne, FL", "02/12/2016", "8:15 PM");

        // adding the games to the ArrayList schedule
        schedule.addGame(jW);
        schedule.addGame(cit);
        schedule.addGame(duke);
        schedule.addGame(duke2);
        schedule.addGame(ten);
        schedule.addGame(uncC);
        schedule.addGame(usc);
        schedule.addGame(od);
        schedule.addGame(ccu);
        schedule.addGame(ccu2);
        schedule.addGame(app);
        schedule.addGame(usc2);
        schedule.addGame(clem);
        schedule.addGame(ken);
        schedule.addGame(ecu);
        schedule.addGame(ecu2);
        schedule.addGame(uga);
        schedule.addGame(ecu3);
        schedule.addGame(gt);
        schedule.addGame(life);
        schedule.addGame(life2);
        schedule.addGame(wf);
        schedule.addGame(flt);

        return schedule;
    }
    
        /**
     * Creates an ArrayList of Player objects as well as two Player objects to
     * populate the list.
     * 
     * @return ArrayList of Player objects
     */
    public Team createTeam()
    {
        // Creates a Team object that is an ArrayList of Player objects
        Team roster = new Team();

        // Two default Player Objects to populate the roster
        Player brettP = new Player("Brett", "Perrine", "Defense", 21, 2017, 20064966, 6, 1, 165, "L");
        Player rileyK = new Player("Riley", "Fromerth", "forward", 57, 2018, 20034567, 6, 1, 210, "L");
        Player jLeblanc = new Player("Justin", "LeBlanc", "Forward", 16, 2019, 20394884, 5, 9, 195, "L");
        Player thaler = new Player("Tj", "Thaler", "Forward", 27, 2017, 203958754, 5, 9, 180, "R");
        Player savino = new Player("Billy", "Savino", "Forward", 22, 2018, 20341254, 6, 2, 200, "R");
        Player leddy = new Player("Kyle", "Leddy", "Forward", 44, 2018, 20395421, 5, 11, 180, "R");
        Player tamsky = new Player("Benjamin", "Tamsky", "Forward", 2, 2019, 201274537, 5, 7, 170, "R");
        Player ging = new Player("Patrick", "Ginger", "Defense", 6, 2018, 201928837, 5, 6, 175, "R");
        Player traxler = new Player("Philip", "Traxler", "Defense", 5, 2019, 20192834, 5, 9, 185, "R");
        Player mander = new Player("Pavel", "Mander", "Defense", 26, 2018, 20192234, 6, 2, 200, "L");
        Player peller = new Player("Jacob", "Peller", "Forward", 17, 2019, 20199867, 6, 0, 180, "R");
        Player hoff = new Player("Joshua", "Hoff", "Defense", 10, 2016, 20101010, 6, 0, 200, "R");
        Player craig = new Player("Brian", "Craig", "Forward", 28, 2018, 20192454, 5, 8, 177, "R");
        Player hawes = new Player("Brandon", "Hawes", "Forward", 14, 2019, 20192224, 6, 5, 215, "R");
        Player hartman = new Player("Brady", "Hartman", "Forward", 9, 2018, 298334534, 5, 9, 190, "R");
        Player kostr = new Player("Luke", "Kostrzewski", "Forawrd", 15, 2019, 20192834, 6, 1, 170, "R");
        Player sliker = new Player("Evan", "Sliker", "Defense", 8, 2019, 201938475, 6, 0, 200, "L");
        Player house = new Player("Nicholas", "House", "Defense",35, 2019, 20029394, 5, 11, 165, "L");
        Player epstien = new Player("Brett", "Epstien", "Goalie", 33, 2018, 20192777, 5, 8, 165, "R");
        Player wiser = new Player("Michael", "Wiser", "Goalie", 31, 2018, 20192834, 5, 11, 180, "R");
        Player diBrigia = new Player("Joey", "DiBrigida", "Goalie", 30, 2017, 20192334, 5, 9, 185, "R");

        epstien.setStats(0, 0, 0, 0);
        wiser.setStats(0, 0, 0, 0);
        diBrigia.setStats(0, 0, 0, 0);
        sliker.setStats(9, 4, 10, 12);
        kostr.setStats(8, 0, 0, 2);
        hartman.setStats(12, 1, 3, 0);
        hawes.setStats(12, 1, 6, 0);
        craig.setStats(12, 2, 5, 6);
        house.setStats(10, 1, 2, 8);
        hoff.setStats(11, 4, 3, 23);
        peller.setStats(12, 6, 1, 2);
        mander.setStats(11, 5, 5, 4);
        traxler.setStats(12, 4, 7, 8);
        ging.setStats(12, 3, 9, 27);
        tamsky.setStats(11, 4, 8, 2);
        leddy.setStats(8, 7, 9, 16);
        savino.setStats(12, 7, 12, 2);
        thaler.setStats(12, 11, 10, 21);
        brettP.setStats(5, 8, 2, 17);
        rileyK.setStats(7, 9, 12, 9);
        jLeblanc.setStats(11, 9, 2, 10);

        roster.addPlayer(brettP);
        roster.addPlayer(rileyK);
        roster.addPlayer(jLeblanc);
        roster.addPlayer(thaler);
        roster.addPlayer(savino);
        roster.addPlayer(leddy);
        roster.addPlayer(tamsky);
        roster.addPlayer(ging);
        roster.addPlayer(traxler);
        roster.addPlayer(mander);
        roster.addPlayer(peller);
        roster.addPlayer(hartman);
        roster.addPlayer(hoff);
        roster.addPlayer(craig);
        roster.addPlayer(hawes);
        roster.addPlayer(kostr);
        roster.addPlayer(sliker);
        roster.addPlayer(house);
        roster.addPlayer(diBrigia);
        roster.addPlayer(wiser);
        roster.addPlayer(epstien);

        return roster;
    }
    
    
    /**
     * Creates a new Player object by prompting user input using the console
     * and saves the new Player to an the parameter.
     * Allows user to choose to print out new player or call setPlayerStats()
     * to continue adding attributes.
     * 
     * @param roster an ArrayList of Player objects
     */
    public void createPlayer(Team roster)
    {
    	
    	//textField.clear();
        if (stage == 1) {
        	textArea.appendText("\nPlease Enter First Name Below: ");
        	firstName = textField.getText();
        	textField.clear();
        	stage++;
        } else if (stage == 2) {
        	lastName = textField.getText();
        	stage++;
        	textField.setText("");
        	textArea.appendText("\nPlease enter password: ");
        } else if (stage == 3) {
        	String password = textField.getText();
        	stage++;
        	textField.setText("");}
         
        textArea.appendText("\n");
        Player newPlayer;
        
        textArea.appendText("\nEnter the players last name: ");
        String lastName = textField.getText();
       
        textArea.appendText("\nEnter the players position:  ");
        String position = textField.getText();
        
        textArea.appendText("\nEnter the players number:  ");
        int num = Integer.parseInt(textField.getText());
        
        textArea.appendText("\nEnter the players graduation year:  ");
        int gY = Integer.parseInt(textField.getText());
        
        textArea.appendText("\nEnter the players student ID:  ");
        int iD = Integer.parseInt(textField.getText());
        
        // ensures the height of the player will be within a plausable range
        textArea.appendText("\nEnter the players height in FEET: ");
        int hF = Integer.parseInt(textField.getText());
  
        // ensures that the value of inches is legitimate
        textArea.appendText("\nEnter the players height (INCHES) left: ");
        int hI = Integer.parseInt(textField.getText());

        // ensures the weight of the player is within a plausable range
        textArea.appendText("\nEnter the players weight: ");
        int w = Integer.parseInt(textField.getText());
        
        textArea.appendText("\nEnter the players shooting direction (L or R): ");
        String shot = textField.getText();
        
        
        newPlayer = new Player(firstName, lastName, position, num,  
                                      gY, iD, hF, hI, w, shot);
        roster.addPlayer(newPlayer);
        
                
        // asking the user if they would like to enter the statistics or view player
        textArea.appendText("\n");
        textArea.appendText("\nWould you like to enter this players stats? ");
        textArea.appendText("\n");
        textArea.appendText("\n1: Yes");
        textArea.appendText("\n2: No");
        textArea.appendText("\n");
        textArea.appendText("\nEnter here: ");
        
        int stats;
        stats = Integer.parseInt(textField.getText());
        
        switch (stats) {
            case 1:
                setPlayerStats(newPlayer);
                break;
            case 2:
                textArea.appendText("\n");
                textArea.appendText("Here is " + newPlayer.getName() + "'s "
                        + "information: ");
                textArea.appendText("\n");
                textArea.appendText(newPlayer.toString());
                break;
            default:
                textArea.appendText("\n");
                textArea.appendText(" | You were supposed to input an integer | ");                
                break;
        }
        }

       
    
    /**
     * Allows the user to create a new Staff of type OrgMember with a series of
     * prompts. Method also prints the new members information to the console
     * 
     * @param staff is an ArrayList of type Team
     * @return ArrayList staff with the new Staff Member added
     */
    public Team createStaffMember(Team staff)
    {
        // building a new scanner to get user input
        textArea.appendText("\n");
        textField.clear();
        
        // series of prompts to collect OrgMember information
        if(stage == 1)
        {
        textArea.appendText("Enter the staff member's first name: ");
        firstName = textField.getText();
        stage++;
        }
        else if(stage == 2)
        {
        textArea.appendText("\n fuck");
        }
        else
        {
        	textArea.appendText("End");
        }
        
        
        textArea.appendText("Enter the staff member's last name: ");
        String lastName = textField.getText();
        
        textArea.appendText("Enter the staff member's graduation year:  ");
        int gradYear = Integer.parseInt(textField.getText());
        

        textArea.appendText("Enter the staff member's student ID:  ");
        int iD = Integer.parseInt(textField.getText());
        
        textArea.appendText("Enter staff member's game day position: ");
        String gDPosition = textField.getText();
        
        //Passes newStaffMember information to constructor
        Staff newStaffMember = new Staff(firstName, lastName ,gradYear, iD, gDPosition);
        
        //Adds newStaffMEmber to ArrayList of OrgMember objects
        staff.addStaff(newStaffMember);  
        textArea.appendText("\n");
        textArea.appendText("This is your new Staff Member: ");
            
        return staff;
    }
    

    /**
     * Sets the game statistics for the game object it is passed.
     * @param game object to update statistics for.
     */
    public void setGameStats(Game game)
    {
            Scanner in = new Scanner(System.in);
            textArea.appendText("\n");
            
            textArea.appendText("Enter the game result (Ex. C of C Wins): ");
            String outcome = in.nextLine();
            
            // ensures only positive input for the number of goals scored
            textArea.appendText("Enter the number of goals scored by C of C: ");
            int gF = in.nextInt();

            
            // ensures only positive input for the nubmer of goals against
            textArea.appendText("Enter the number of goals scored by the opponent: ");
            int gA = in.nextInt();
            
            
            game.setGameStats(gF, gA, outcome); // sets input to game object
            textArea.appendText("\n");
            
            //prints out updated game
            textArea.appendText("Here is your updated game:");
            textArea.appendText("\n");
            textArea.appendText(game.toString());
            
    }
    
    /**
     * Sets the statistics (goals, assists, games played and penalty minutes)
     * for the Player object passed as a parameter.
     * 
     * @param newPlayer a Player object to have its statistics updated.
     *  
     */
    public void setPlayerStats(Player newPlayer) 
    {
        try {
            
            // Scanner object to get user input
            Scanner in = new Scanner(System.in);
            
           
            textArea.appendText("\n");
            textArea.appendText("Enter the players goals: ");
            
            int g = in.nextInt();
            // ensuring goals cannot be negative, thows exception is otherwise.
            if (g < 0)
               throw new NegativeStatsException("This cannot be a negative "
                                                   + "number...");
            
            
            // ensuring assists cannot be negative, thows exception is otherwise.
            textArea.appendText("Enter the players assists: ");
            int a = in.nextInt();
            if (a < 0)
                throw new NegativeStatsException("This cannot be a "
                                                    + "negative integer...");
            
       // ensuring games played cannot be negative, thows exception is otherwise.
            textArea.appendText("Enter the players games played: ");
            int gP = in.nextInt();
            if (gP < 0)
                throw new NegativeStatsException("This cannot be a "
                                                    + "negative integer...");
           
            // ensuring PIMS cannot be negative, thows exception is otherwise.
            textArea.appendText("Enter the players Penalty Minutes: ");
            int pIMS = in.nextInt();
            if (pIMS < 0)
                throw new NegativeStatsException("This cannot be a "
                                                    + "negative integer...");
            
            
            newPlayer.setStats(gP, g, a, pIMS); //setting newPlayer's stats
          //  newPlayer.setAssists(6);
          //  textArea.appendText(checkPlayerStats(newPlayer, gP, g, a, pIMS));
           // assert checkPlayerStats(newPlayer, gP, g, a, pIMS) : "Test";
            
            
            // new menu to prompt if user wants to view completed player
            textArea.appendText("\n");
            textArea.appendText("Would you like to view your updated player? ");
            textArea.appendText("\n");
            textArea.appendText("3: View Player");
            textArea.appendText("\n");
            textArea.appendText("Enter any other integer go back to the main menu: ");
            
            
            // if vP (view player)  = 3 the player is printed, if not switch 
            // breaks and returns to main menu.
            int vP = in.nextInt();
            switch (vP) {
                case 3:
                    textArea.appendText("\n");
                    textArea.appendText("Here is " + newPlayer.getName() + "'s "
                            + "information:");
                    textArea.appendText("\n");
                    textArea.appendText(newPlayer.toString());
                    break;
                default:
                    break;
            }  
        } 
        
        catch (NegativeStatsException e) {
            System.err.println("That Wasn't a valid statistic!");    
            setPlayerStats(newPlayer);
        }
        
    }
  
    /** Creates a new Game object by prompting the user for input and places it 
     * in an ArrayList, schedule, composed of Game objects.
     *
     * @param schedule
     * 
     */
    public void createGame(Schedule schedule)
    {      
            if (stage == 0)
            {
            	name = textField.getText();
                
                textArea.appendText("\nEnter the opponents name: ");
                textField.clear();
                stage++;
            }
            else if(stage == 1)
            {
            	textArea.appendText("\n\nFuck");
            }

            
            textArea.appendText("Enter the location: ");
            String location = textField.getText();
            
            textArea.appendText("Enter the date of the game in format XX/XX/XXXX: ");
            String day = textField.getText();
            
            textArea.appendText("Enter the games start time: ");
            String start = textField.getText();
          
            Game newGame = new Game(name, location, day, start);
            
            schedule.addGame(newGame);
            textArea.appendText("You have entered: ");
            textArea.appendText("\n");
                
            textArea.appendText(newGame.toString());
    }
  
    /**
     * Prompts user for the jersey number (int) of the player they are searching
     * for.
     * 
     * @param roster is an ArrayList of game
     * @return Player the user was searching for with int(playerNumber)
     * numerical value to search.
     */
    public Player findPlayer(Team roster)
    {
        
        try {
            
            //scanner for user input
            Scanner in = new Scanner(System.in);
            textArea.appendText("Enter the number of the Player who's stats you'd");
            textArea.appendText("like to update update: ");
            
            int playerNum = in.nextInt();
            
            // ensuring the user inputs a valid player number
            if (playerNum <= 0 || playerNum >= 99)
                throw new NegativeStatsException("There are only numbers between"
                                              + "1 and 99");
            textArea.appendText("\n");
            
            // loops through the roster, returns the player with the same number
            // as user input
            for (int i = 0; i < roster.size(); i++)
            {
                Player current = roster.getPlayer(i);
                
                if (playerNum == current.getPlayerNum()) 
                {
                    textArea.appendText("Enter " + current.getName() + "'s stats");
                    return roster.getPlayer(i);
                }
            }
            
            return null;
        } catch (NegativeStatsException e) {
            findPlayer(roster);
        }
        return roster.getPlayer(0);
    }
    
    /**
     * Finds a game within the schedule based on its numerical value (in order
     * of entry).
     * @param schedule
     * @return Game that the user was searching for
     */
    public Game findGame(Schedule schedule)
    {
        Scanner in = new Scanner(System.in);
        
        textArea.appendText("Enter the game number: ");
        
        int gameNum = in.nextInt();
        textArea.appendText("\n");
        
        // calls findGame() which loops indexes the schedule with the number
        // of the game in order based on date
        Game game = schedule.findGame(gameNum -1);
        textArea.appendText("Enter the statistics for the game against " 
                            + game.getOpponent() + " on " + game.getDay());
        
        return game;
    }
    
    public static boolean checkPlayerStats(Player p, int gP, int g, int a, 
                                            int pIMS)
    {
         return !(p.getGamesPlayed() != gP || p.getGoals() != g || p.getAssists() != a
                 || p.getPenaltyMinutes() != pIMS);
    }
    
    /**
     * Prints out a welcome statement as well as creates instances of two teams
     * roster and staff as well as a schedule.  By calling mainMenu() the user 
     * is presented with options based on integer input to access the functions
     * they would like to perform.  All of this is within a try-catch which 
     * terminates the program, as will user input of -1.
     * 
     * @param roster - an ArrayList of Player objects
     */
    
    
    public void saveRoster(Team roster)
    {
        FileWriter myWriter = null;
        int length = roster.size();
        
        try {
            myWriter = new FileWriter("players.txt");
        
        for (int i = 0; i < length; i++)
        {
            Player p = roster.getPlayer(i); 
            
            textArea.appendText("***** IN WRITER CLASS ***** " + p);
            myWriter.write("Player: " + p.getName() + " | Position: " + 
                            p.getPosition() + "\n");
            
        } 
        
        }
        catch (IOException e) {
            System.err.println("IOException: " + "Something went wrong.");
        } 
        finally{
            try {
            myWriter.close();
        } catch (IOException e) {
            System.err.println("IOExcetion: " + "Couldn't close file.");
        }
        }
    }
    
    public void readRoster(Team roster) 
    {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("players.txt"));
            String temp;     
            while ((temp = reader.readLine()) != null)
            {
                textArea.appendText("***** IN READER CLASS *****");
                String [] fields = temp.split("\\|");
                String [] playerNameFields = fields[0].split(":");
                String [] playerPosFields = fields[1].split(":");
                
                String name = playerNameFields[1];
                String pos = playerPosFields[1];               
                textArea.appendText("\n"+name);
                textArea.appendText("\n"+pos);
                
                Player p = new Player(name, pos);
                roster.addPlayer(p);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + "that file doesn't exist!");
        }
        catch (IOException e){
            System.err.println("File IO Exception");
        }
    }
    
    public CofCHockeyApp(TextArea ta, TextField tf) {
    	textArea = ta;
    	textField = tf;
    }
    
    public void run(String input) 
    {
        textArea.appendText("Welcome to the College of Charleston Men's Ice " +
                           " Hockey app!");
        textArea.appendText("\n");
        
        Schedule schedule = createSchedule(); // creates an instance of schedule
        Team roster = createTeam(); // creates an instance of roster
        Team staff = createStaff(); // creates an instance of staff
        
       //boolean carryOn = true; // allows while loop to continue until -1 is input
       
       try{
            //while(carryOn)
            //{
    	   mainMenu();
    	    choice = Integer.parseInt(input); // user input

                if (choice == 1)
                {
                 textArea.appendText("\n"+roster); // prints ArrayList roster 
                   
                }
                else if (choice == 2)
                {
                   textArea.appendText("\n"+schedule); // prints ArrayList schedule
                }
                else if (choice == 3)
                {
                    textArea.appendText("\n"+staff); // prints ArrayList staff
                }
                else if (choice == 4)   
                {
                   createPlayer(roster);// allows user to create new player
                }

                else if (choice == 5)
                {
                   createGame(schedule); // allows user to create new game
                }
                 
                else if (choice == 6)
                {
                   createStaffMember(staff);  // allows user to create new staff member
                }
                
                else if (choice == 7)
                {
                   Player p =findPlayer(roster); // finds player then updates player stats
                   setPlayerStats(p);         
                }
                
                else if (choice == 8)
                {
                    setGameStats(findGame(schedule)); // finds game and updates its stats
                }
                
                else if (choice == 9)
                {
                    saveRoster(roster);
                }
                
                else if (choice == 10)
                {
                    readRoster(roster);
                }
                /*else if (value == -1)
                {
                    carryOn = false; // exits program
                }*/
                
                
                else
                {
                     textArea.appendText("\n"+"That was not an option!!");
                }
            //}
        } catch(NumberFormatException e) {
        	
        }
        catch (InputMismatchException e) 
        {
            System.err.println("InputMismatchException: " + 
                               "You were told to enter an integer!");
        }

        //textArea.appendText("Thank you for visiting, Go Cougars!");
    }
    }
