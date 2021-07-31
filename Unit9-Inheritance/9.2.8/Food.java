public class Food
{
    private String name;
    private int calories;
    
    public Food (String foodName, int calories)
    {
        name = foodName;
        this.calories = calories;
    }
    
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getCal()
    {
        return calories;
    }
    public void setCal(int calories)
    {
        this.calories = calories;
    }
}
