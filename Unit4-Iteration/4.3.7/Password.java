import java.util.Scanner;

public class Password 
{
    public static void main(String[] args) 
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = input.nextLine();
        boolean valid = passwordCheck(password);
        System.out.println(valid);
    }
    
    
   public static boolean passwordCheck(String password)
   {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters
        // and numbers.
        String alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        boolean valid;

        if (password.length()>= 8)
        {
            valid = true;

            for(int i = 0; i < password.length(); i++){

                if (alphanum.indexOf(password.charAt(i)) != -1 && valid != false)
                {
                    valid = true;
                }

                else
                {
                    valid = false;
                }

            }

        }
        else
        {
            valid = false;
        }

         return valid;
    }
}
