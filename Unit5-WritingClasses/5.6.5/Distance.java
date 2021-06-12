public class Distance
{
    private double miles;
    
    public Distance(double startMiles)
    {
        miles = startMiles;
    }
    public double toKilometers()
    {
        double km = miles/0.62137;
        return km;
    }
    public double toYards()
    {
        double yds = miles*1760;
        return yds;
    }
    public double toFeet()
    {
        double ft = miles*5280;
        return ft;
    }
    public double getMiles()
    {
        return miles;
    }
}
