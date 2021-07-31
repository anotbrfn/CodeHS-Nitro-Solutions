public class Fruit extends HealthyFood
{
    private boolean local;
    private String color;
    
    public Fruit(String foodName, int calories, boolean isLocal, String foodColor)
    {
        super(foodName, calories, "Fruit");
        color = foodColor;
    }
    
    public boolean isLocal()
    {
        return local;
    }
    public String getColor()
    {
        return color;
    }
}
