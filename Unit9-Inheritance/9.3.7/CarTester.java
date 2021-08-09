public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car a = new Car("A", "Twelve");
        // Print out the model
        System.out.println(a.getModel());
        // Print out the MPG
        System.out.println(a.getMPG());
        // Print the object
        System.out.println(a);
        // Create an ElectricCar object
        Car b = new ElectricCar("B");
        // Print out the model
        System.out.println(b.getModel());
        // Print out the MPG
        System.out.println(b.getMPG());
        // Print the object
        System.out.println(b);
    }
}
