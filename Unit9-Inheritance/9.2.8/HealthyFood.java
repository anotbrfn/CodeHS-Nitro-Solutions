public class HealthyFood extends Food
{
    private String group;
    
    public HealthyFood(String foodName, int calories, String foodGroup)
    {
        super(foodName, calories);
        group = foodGroup;
    }
    
    
    public String getGroup()
    {
        return group;
    }
}
