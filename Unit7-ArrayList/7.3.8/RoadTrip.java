import java.util.ArrayList;
public class RoadTrip
{
    private ArrayList<GeoLocation> places;
    
    public RoadTrip()
    {
        this.places = new ArrayList<GeoLocation>();
    }
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        places.add(new GeoLocation(name, latitude, longitude));
    }
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return places.size();
    }
    // Get the total miles of the trip
    public double getTripLength()
    {
        double total = 0;
        for(int i = 1; i < places.size(); i++)
        {
            total += places.get(i).distanceFrom(places.get(i - 1));
        }
        return total;
    }
    // Return a formatted toString of the trip
    public String toString()
    {
        String list = "";
        
        for(int i = 0; i < places.size(); i++)
        {
            list += i + 1 + ". " + places.get(i).toString() + "\n";
            
        }
        return list;
    }
}
