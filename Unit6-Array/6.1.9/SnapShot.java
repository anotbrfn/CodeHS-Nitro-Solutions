public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] arr = { "Welcome", "to", "the snap shot", "app!" };
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
        arr[0] = "Upgrade";
        arr[arr.length - 1] = "premium app!";
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
