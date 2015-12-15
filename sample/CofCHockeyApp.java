/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

This is an application for the College of Charleston Ice Hockey team

 */
package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The main driver of the console app.  Creates the main menu as well as menus pertaining to the manipulation
 * of information ie updating player stats, game stats, creating new players.
 * @author Brett Perrine
 */
public class CofCHockeyApp
{
    private TextField textField;
    private TextArea textArea;
    private int choice = 0;

    Schedule schedule = createSchedule(); // creates an instance of schedule
    Team roster = createTeam(); // creates an instance of roster
    Team staff = createStaff(); // creates an instance of staff

    /**
     * Prints out the numbered menu of options via the console
     */
    public void mainMenu()
    {
        textArea.appendText("\n");
        textArea.appendText("\n-------------------------------------------------");
        textArea.appendText("\nEnter from the following options or -1 to quit. ");
        textArea.appendText("\n");
        textArea.appendText("\n1: View Roster ");
        textArea.appendText("\n2: View Schedule ");
        textArea.appendText("\n3: View Staff ");
        textArea.appendText("\n4: Add Player ");
        textArea.appendText("\n5: Add Game ");
        textArea.appendText("\n6: Add Staff Member ");
        textArea.appendText("\n7: Update Player Stats");
        textArea.appendText("\n8: Update Game Results");
        textArea.appendText("\n9: Save Roster");
        textArea.appendText("\n10: View Saved Information ");
        textArea.appendText("\n-------------------------------------------------");
        textArea.appendText("\n");
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
     * @return Schedule - an ArrayList of Game objects
     */
    public Schedule createSchedule()
    {
        // Creates a Schedule object that is an ArrayList composed of Game objects
        Schedule schedule = new Schedule();

        //Games for the season
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
     * @return Team - ArrayList of Player objects
     */
    public Team createTeam()
    {
        // Creates a Team object that is an ArrayList of Player objects
        Team roster = new Team();

        // The roster of players
        Player brettP = new Player("Brett", "Perrine", "Defense", 21, 2017, 20064966, 6, 1, 165, "L");
        Player rileyK = new Player("Riley", "Fromerth", "Forward", 57, 2018, 20034567, 6, 1, 210, "L");
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
        Player kostr = new Player("Luke", "Kostrzewski", "Forward", 15, 2019, 20192834, 6, 1, 170, "R");
        Player sliker = new Player("Evan", "Sliker", "Defense", 8, 2019, 201938475, 6, 0, 200, "L");
        Player house = new Player("Nicholas", "House", "Defense",35, 2019, 20029394, 5, 11, 165, "L");
        Player epstien = new Player("Brett", "Epstien", "Goalie", 33, 2018, 20192777, 5, 8, 165, "R");
        Player wiser = new Player("Michael", "Wiser", "Goalie", 31, 2018, 20192834, 5, 11, 180, "R");
        Player diBrigia = new Player("Joey", "DiBrigida", "Goalie", 30, 2017, 20192334, 5, 9, 185, "R");

        // Sets all of the statistics for each player
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

        // adds all of the created players to the ArrayList<Player> roster
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
        roster.addPlayer(hoff);
        roster.addPlayer(hartman);
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
        Scanner in = new Scanner(System.in);
        System.out.println();
        Player newPlayer;

        // gathering basic OrgMember information to pass to the super class
        System.out.print("Enter the players first name: ");
        String firstName = in.next();

        System.out.print("Enter the players last name: ");
        String lastName = in.next();

        System.out.print("Enter the players position(Forward, Defense, Goalie):  ");
        String position = in.next();

        System.out.print("Enter the players number(1-99):  ");
        int num = in.nextInt();

        System.out.print("Enter the players graduation year(2015-2019):  ");
        int gY = in.nextInt();

        System.out.print("Enter the players student ID:  ");
        int iD = in.nextInt();

        System.out.print("Enter the players height in FEET(0-8): ");
        int hF = in.nextInt();

        System.out.print("Enter the players height INCHES(0-12): ");
        int hI = in.nextInt();

        System.out.print("Enter the players weight(0-1000): ");
        int w = in.nextInt();

        System.out.print("Enter the players shooting direction (L or R): ");
        String shot = in.next();


        newPlayer = new Player(firstName, lastName, position, num,
                gY, iD, hF, hI, w, shot);
        roster.addPlayer(newPlayer);

        // asking the user if they would like to enter the statistics or view player
        System.out.println();
        System.out.println("Would you like to enter this players stats? ");
        System.out.println();
        System.out.println("1: Yes");
        System.out.println("2: No");
        System.out.println();
        System.out.print("Enter here: ");

        int stats;
        stats = in.nextInt();

        switch (stats) {
            case 1:
                setPlayerStats(newPlayer);
                break;
            case 2:
                System.out.println();
                System.out.println("Here is " + newPlayer.getName() + "'s " + "information: ");
                System.out.println();
                System.out.println(newPlayer.toString());
                break;
            default:
                System.out.println();
                System.out.println(" | You were supposed to input an integer | ");
                break;
        }
    }

    /** Creates a new Game object by prompting the user for input and places it
     * in an ArrayList, schedule, composed of Game objects.
     *
     * @param schedule an ArrayList of game objects
     *
     */
    public void createGame(Schedule schedule)
    {

        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the opponents name: ");
        String name = in.nextLine();

        System.out.print("Enter the location: ");
        String location = in.nextLine();

        System.out.print("Enter the date of the game in format XX/XX/XXXX: ");
        String day = in.nextLine();

        System.out.print("Enter the games start time: ");
        String start = in.nextLine();

        Game newGame = new Game(name, location, day, start);

        schedule.addGame(newGame);
        System.out.println("You have entered: ");
        System.out.println();

        System.out.println(newGame.toString());

        System.out.println("Would you like to enter the games stats? ");
        System.out.println();
        System.out.println("1: Yes");
        System.out.println("2: No");
        System.out.println();
        System.out.print("Enter here: ");

        int stats;
        stats = in.nextInt();

        switch (stats) {
            case 1:
                setGameStats(newGame);
                break;
            case 2:
                System.out.println();
                System.out.println("Here is the statistics for the game against" + newGame.getOpponent()+ " on " +
                        newGame.getDay());
                System.out.println();
                System.out.println(newGame.toString());
                break;
            default:
                System.out.println();
                System.out.println(" | You were supposed to input an integer | ");
                break;
        }
    }

    /**
     * Allows the user to create a new Staff of type OrgMember with a series of
     * prompts. Method also prints the new members information to the console
     *
     * @param staff is an ArrayList of type Team
     * @return Team - ArrayList staff with the new Staff Member added
     */
    public static Team createStaffMember(Team staff)
    {
        // building a new scanner to get user input
        Scanner in = new Scanner(System.in);
        System.out.println();

        // series of prompts to collect OrgMember information
        System.out.print("Enter the staff member's first name: ");
        String firstName = in.next();

        System.out.print("Enter the staff member's last name: ");
        String lastName = in.next();

        System.out.print("Enter the staff member's graduation year(2015-2019):  ");
        int gradYear = in.nextInt();

        System.out.print("Enter the staff member's student ID:  ");
        int iD = in.nextInt();

        System.out.print("Enter staff member's game day position: ");
        String gDPosition = in.next();

        //Passes newStaffMember information to constructor
        Staff newStaffMember = new Staff(firstName, lastName ,gradYear, iD, gDPosition);

        //Adds newStaffMEmber to ArrayList of OrgMember objects
        staff.addStaff(newStaffMember);
        System.out.println();
        System.out.println("This is your new Staff Member: ");
        System.out.println(newStaffMember.toString());

        return staff;
    }


    /**
     * Sets the game statistics for the game object it is passed.
     * @param game object to update statistics for.
     */
    public static void setGameStats(Game game)
    {
        Scanner in = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the game result (Ex. C of C Wins): ");
        String outcome = in.nextLine();

        // ensures only positive input for the number of goals scored
        System.out.print("Enter the number of goals scored by C of C: ");
        int gF = in.nextInt();


        // ensures only positive input for the nubmer of goals against
        System.out.print("Enter the number of goals scored by the opponent: ");
        int gA = in.nextInt();


        game.setGameStats(gF, gA, outcome); // sets input to game object
        System.out.println();

        //prints out updated game
        System.out.println("Here is your updated game:");
        System.out.println();
        System.out.println(game.toString());

    }

    /**
     * Sets the statistics (goals, assists, games played and penalty minutes)
     * for the Player object passed as a parameter. All must be positive
     *
     * @param newPlayer a Player object to have its statistics updated.
     *
     */
    public void setPlayerStats(Player newPlayer)
    {
        try {
            // Scanner object to get user input
            Scanner in = new Scanner(System.in);

            System.out.println();
            System.out.print("Enter the players goals: ");

            int g = in.nextInt();
            // ensuring goals cannot be negative, thows exception is otherwise.
            if (g < 0)
                throw new IllegalArgumentException("This cannot be a negative "
                        + "number...");

            // ensuring assists cannot be negative, thows exception is otherwise.
            System.out.print("Enter the players assists: ");
            int a = in.nextInt();
            if (a < 0)
                throw new IllegalArgumentException("This cannot be a "
                        + "negative integer...");

            // ensuring games played cannot be negative, thows exception is otherwise.
            System.out.print("Enter the players games played: ");
            int gP = in.nextInt();
            if (gP < 0)
                throw new IllegalArgumentException("This cannot be a "
                        + "negative integer...");

            // ensuring PIMS cannot be negative, thows exception is otherwise.
            System.out.print("Enter the players Penalty Minutes: ");
            int pIMS = in.nextInt();
            if (pIMS < 0)
                throw new IllegalArgumentException("This cannot be a "
                        + "negative integer...");

            newPlayer.setStats(gP, g, a, pIMS); //setting newPlayer's stats

            // new menu to prompt if user wants to view completed player
            System.out.println();
            System.out.println("Would you like to view your updated player? ");
            System.out.println();
            System.out.println("3: View Player");
            System.out.println();
            System.out.print("Enter any other integer go back to the main menu: ");

            int vP = in.nextInt();
            switch (vP) {
                case 3:
                    System.out.println();
                    System.out.println("Here is " + newPlayer.getName() + "'s "
                            + "information:");
                    System.out.println();
                    System.out.println(newPlayer.toString());
                    break;
                default:
                    break;
            }
        }

        catch (IllegalArgumentException e) {
            System.err.println("That Wasn't a valid statistic!");
            setPlayerStats(newPlayer);
        }
    }

    /**
     * Prompts user for the jersey number (int) of the player they are searching
     * for. Catches an IllegalArgumentException and re propts you for input. If
     * the player doesn't exist then player 0 (Brett Perrine) will be selected
     *
     * @param roster is an ArrayList of game
     * @return Player the user was searching for with int(playerNumber)
     * numerical value to search.
     */
    public static Player findPlayer(Team roster)
    {

        try {

            //scanner for user input
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of the Player who's stats you'd");
            System.out.print("like to update update: ");

            int playerNum = in.nextInt();

            // ensuring the user inputs a valid player number
            if (playerNum <= 0 || playerNum >= 99)
                throw new IllegalArgumentException("There are only numbers between"
                        + "1 and 99");
            System.out.println();

            // loops through the roster, returns the player with the same number
            // as user input
            for (int i = 0; i < roster.size(); i++)
            {
                Player current = roster.getPlayer(i);

                if (playerNum == current.getPlayerNum())
                {
                    System.out.println("Enter " + current.getName() + "'s stats");
                    return roster.getPlayer(i);
                }
            }

            return null;
        } catch (IllegalArgumentException e) {
            findPlayer(roster);
        }
        return roster.getPlayer(0);
    }

    /**
     * Finds a game within the schedule based on its numerical value (in order
     * of entry).
     * @param schedule - the ArrayList of games to search
     * @return Game that the user was searching for
     */
    public static Game findGame(Schedule schedule)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the game number: ");

        int gameNum = in.nextInt();
        System.out.println();

        // calls findGame() which loops indexes the schedule with the number
        // of the game in order based on date
        Game game = schedule.findGame(gameNum -1);
        System.out.println("Enter the statistics for the game against "
                + game.getOpponent() + " on " + game.getDay());

        return game;
    }

    /**
     * Checks the players statistics
     * @param p - player who's statistics you would like to check
     * @param gP - games played by player
     * @param g - goals scored by player
     * @param a - assists made by player
     * @param pIMS - penalty minutes accumulated by player
     * @return boolean
     */
    public static boolean checkPlayerStats(Player p, int gP, int g, int a,
                                           int pIMS)
    {
        return !(p.getGamesPlayed() != gP || p.getGoals() != g || p.getAssists() != a
                || p.getPenaltyMinutes() != pIMS);
    }

    /**
     * Saves the roster into a players.txt
     *
     * @param roster - an ArrayList of Player objects to be written to the file
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

    /**
     * Reads the players.txt file and recreates the player objects from that file based on name and position.
     *
     */
    public void readRoster()
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
                Team newRoster = new Team();
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

    /**
     * The run class "runs" the programs menu choices.
     * @param input input from the Main.java class
     */
    public void run(String input)
    {
        textArea.appendText("Welcome to the College of Charleston Men's Ice " +
                " Hockey app!");
        textArea.appendText("\n");

        try{

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
                readRoster();
            }

            else {
                textArea.appendText("\n" + "That was not an option!!");
            }

        } catch(java.lang.NumberFormatException e) {

        }
        catch (InputMismatchException e)
        {
            System.err.println("InputMismatchException: " +
                    "You were told to enter an integer!");
        }
    }
}

