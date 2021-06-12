import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        if(user.equals(computer))
        {
            return TIE;
        }
        else if(user.equals("rock") && computer.equals("scissors"))
        {
            return USER_PLAYER;
        }
        else if(user.equals("paper") && computer.equals("rock"))
        {
            return USER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("paper"))
        {
            return USER_PLAYER;
        }
        else
        {
            return COMPUTER_PLAYER;
        }
        
    }
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String userChoice = "";
        if(kb.hasNextLine())
        {
            userChoice = kb.nextLine();
        }
        
        if(userChoice.equals(""))
        {
            System.out.println("Thanks for playing!");
            kb.close();
            return;
        }
        System.out.println("User: " + userChoice);
        String compChoice = "";
        Randomizer rand = new Randomizer();
        int random = rand.nextInt(1, 3);
        if(random == 1)
        {
            compChoice = "rock";
        }
        else if(random == 2)
        {
            compChoice = "paper";
        }
        else if(random == 3)
        {
            compChoice = "scissors";
        }
        System.out.println("Computer: " + compChoice);
        
        System.out.println(getWinner(userChoice, compChoice));
        main(new String[0]);
    }
}
