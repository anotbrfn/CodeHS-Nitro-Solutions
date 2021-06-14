public class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!"};
    
    public static int findString(String myString)
    {
        // your code goes here!
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == myString)
            {
                return i;
            }
        }
        return -1;
    }
}
