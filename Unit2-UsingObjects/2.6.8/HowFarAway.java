import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the latitude of the starting location: ");
        double startLat = keyboard.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double startLong = keyboard.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        double endLat = keyboard.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double endLong = keyboard.nextDouble();
        
        
        GeoLocation startLocation = new GeoLocation(startLat, startLong);
        GeoLocation endLocation = new GeoLocation(endLat, endLong);
        
        double distance = startLocation.distanceFrom(endLocation);
        System.out.println("The distance is " + distance + " miles.");
    }
}
