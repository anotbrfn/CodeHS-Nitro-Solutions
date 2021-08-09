public class ElectricCar extends Car {

    // Complete the constructor
    public ElectricCar(String model){
       super(model, "a");
    }

    // Override the getMPG here.
    // It should return: "Electric cars do not calculate MPG.
    public String getMPG()
    {
        return "Electric cars do not calculate MPG.";
    }

    // Override the toString() here.
    // (model) is an  electric car.
    public String toString()
    {
        return "" + super.getModel() + " is an electric car.";
    }
    
}
