public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        String line = "";
        // Your code goes here! 
        
        for (int i=1; i<6; i++)
        {
            int num = 1;
            for (int j=0; j<i; j++)
            {
                System.out.print(num + " ");
                num += 1;
            }
            
            System.out.println("");
        }
    }
}
