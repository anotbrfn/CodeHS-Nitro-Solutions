public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String[] cityNames = { "Las Vegas", "Minsk", "Sao Paulo" };
        int[] temps = { 104, 73, 80 };
        double[] precip = { 4.17, 26.7, 55.0 };
      // Print all 3 arrays according to the output in the description
        System.out.println(cityNames[0] + " has an average annual precipitation of " + precip[0] + " inches.");
        System.out.println(cityNames[0] + " has an average annual high temp of " + temps[0] + " degrees Fahrenheit.");
        System.out.println(cityNames[1] + " has an average annual precipitation of " + precip[1] + " inches.");
        System.out.println(cityNames[1] + " has an average annual high temp of " + temps[1] + " degrees Fahrenheit.");
        System.out.println(cityNames[2] + " has an average annual precipitation of " + precip[2] + " inches.");
        System.out.println(cityNames[2] + " has an average annual high temp of " + temps[2] + " degrees Fahrenheit.");
    }
}
