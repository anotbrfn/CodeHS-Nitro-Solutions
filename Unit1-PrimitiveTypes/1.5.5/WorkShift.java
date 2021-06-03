public class WorkShift
{
    public static void main(String[] args)
    {
        // Start here!
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        
        hours *= 3600;
        minutes *= 60;
        
        int finalSecs = hours + minutes + seconds;
        System.out.println(finalSecs);
    }
}
