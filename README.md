# CofCMensHockeyApp
___This program runs out of the Main.java file.___
First, a menu will appear with 10 options.  If you input an invalid character, you will be told that it was not an
option and allowed to re-input.

__Options 1,2 and 3__ will simply print out the roster, game schedule and staff to theTextArea.

__Option 9__ will write the roster of players into a file as well as confirm inside the TextArea that each player has
been written.

__Option 10__ will read from a specified file and recreate the Player objects based on name and position, although all
of their statistics will be lost in the process. <-- Issue

All of the above options are to be worked from the GUI, the options below will be selected using the GUI's textField.
Once selected the options work as a series of prompts which ask for certain information regarding what objects you are
creating / modifying.  Once completed, you should return to the GUI to continue program use.

__Option 4__ will create an OrgMember object of type Player.  After the initial series of prompts the information will
be passed to the Player constructor and they will be added to the ArrayList roster, which is particularly an ArrayList
for Player objects.  You will then be asked if you'd like to update the player's statistics you've just created.
Selecting 1 will take you thru more prompts, then print your new player to the console.  If 2 is selected the new
players information will be printed to the console and the statistics will be defaulted to 0.  To ensure the new player
is added to the Roster, you may return to the GUI and enter 1.  The newly added player should appear at the bottom of
the printed ArrayList.

__Option 5__ will create a new Game object.  Thru a series of prompts the information will be passed to the Game
constructor and then add the new Game object to an ArrayList schedule, which is comprised of Game objects.  You will
then be prompted similarly to __Option 4__ and you can enter the statistics for the game, if it has already happened.
The menu follows and asks if you'd like to view.  1 will print the new game to the console, 2 will put you back to the
main menu.  Skipping statistics will initialize goals for and against to 0.

__Option 6__ will create a new OrgMember object of type Staff.  Similarly to the previous two option, will gather the
information needed through a series of prompts and then use the Staff constructor to create the object.  It will then be
added to the Team object staff, which puts in an ArrayList of type OrgMember.  The new staff member's information will
be printed to the console.

__Option 7__ will allow you to update / change the statistics for a given player by prompting for the Player's number.
Then through a series of prompts you will be able to update the Player objects statistics and again prompted if you'd
like to see the updated Player.  If 3 is input into the console, the player will be printed.  All invalid inputs will
send you back to the main menu i.e. back to the GUI.

__Option 8__ will allow you to update / change the statistics for a given Game by asking for the number of the game.
The games are numbered in order of occurrence - so 1 will be the first game against Johnson & Wales, the last would be
23 against Florida Tech.  Similarly to option 7 the changes will be made via prompts, followed by a print on to the
console.  After, you will be back at the main menu (GUI).

##Issues##
Exception handling will pop up on the console and print proper message but not stop the program at the moment of fault.
Additionally, it doesn't default the numbers back to zero (even though the code in the exceptions is set to do so).
The Date and start time are strings therefore it can be anything anything, there aren't any checks on that specific
input. The game day position in option 6 cuts after the first word that you input, instead of taking the entire string.

##Notes##
I would like to keep my grades for File I/O and exceptions.  For my UML grade I would like my re-submitted diagram to be
graded which is in the dropbox.

