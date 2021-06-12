public class Player 
{
    // Static Variables
    // ...
    public static int totalPlayers;
    public static int maxPlayers = 10;
    
    // Public Methods
    public Player() 
    {
        // Some code here...
        totalPlayers++;
    }
    
    // Static Methods 
    // ...
    public static boolean gameFull()
    {
        if(totalPlayers >= maxPlayers)
        {
            return true;
        }
        
        return false;
    }
}
