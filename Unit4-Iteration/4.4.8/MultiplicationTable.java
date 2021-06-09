public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Call makeMultiplicationTable 
       makeMultiplicationTable();
    }
    
    // Makes a multiplcation table
    public static void makeMultiplicationTable()
    {
        // Your code goes here!!!
        // first print the top header row
        int a;
        int b;
        for (a = 1; a <= 10; ++a) 
        {
            for (b = 1; b <= 10; ++b) 
            {
                System.out.print(a*b + "\t");
            }
        System.out.println();
    }
    }
}
