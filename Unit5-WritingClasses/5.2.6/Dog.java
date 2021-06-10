public class Dog
{
    private String name;
    private int age;
    private double weight;

    // Add your constructors here
    public Dog(String dogName, int dogAge, double dogWeight)
    {
        name = dogName;
        age = dogAge;
        weight = dogWeight;
    }
    
    public Dog(String dogName, int dogAge)
    {
        name = dogName;
        age = dogAge;
        weight = 0.0;
    }

    public String toString(){
        return "Name: " + name + "\nWeight: " + weight +  "\nAge: " + age;
    }
}
