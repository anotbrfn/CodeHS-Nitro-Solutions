public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance KSchool = new Distance(5.0);
        Distance KPark = new Distance(10.0);
        Distance KBF = new Distance(12.0);
        // Convert one to yards, one to kilometers,
        // and the last one to feet
        System.out.println(KSchool.toYards());
        System.out.println(KPark.toKilometers());
        System.out.println(KBF.toFeet());
        // Print out the converted values
    }
}
