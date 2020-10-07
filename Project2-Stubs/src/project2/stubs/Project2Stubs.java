package project2.stubs;

public class Project2Stubs {

    /*
    When a user starts 'create' mode, ask them to provide a game 
    introduction/description and write it to a file 'gameintroduction.txt'

Then, allow the user to enter an allowable command like 'go north' 
    and then create a file 'go north.txt', 

When creating a command, ask if user if this command will wound the player, 
    if the answer is yes, write the first line of file as WOUNDED or some similar trigger. If the answer is no, write an empty line.

Then ask the user to enter the description of what happens when a play 
    does that command, and write that to the file on the next line.

Allow them to continue creating commands until they desire to stop 
    (use some sentinel value ).

After all the commands have been entered, ask the user to enter a 
    secret escape word that ends the game. Save that to 'gameescapeword.txt'
    */
    
    
    public static void main(String[] args) {
        
        // create mode
        createGameIntroductionFile();
        
        createGameCommandFiles();
        
        createGameEscapeWordFile();
        
    }
    
    public static void createGameEscapeWordFile()
    {
        
    }
    
    public static void createSingleCommandFile(String commandName)
    {
        // When creating a command, ask if user if this command will wound the player, 
        //  if the answer is yes, write the first line of file as WOUNDED or some similar trigger. 
        //  If the answer is no, write an empty line.

    }
    
    public static void createGameCommandFiles()
    {
        // FIX ME
        String command = "";
        while ( command == "quitCreateMode" )
        {
           createSingleCommandFile(command); 
        }
    }
    
    public static void createGameIntroductionFile()
    {
        
    }
    
}
