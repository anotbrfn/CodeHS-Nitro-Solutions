public class Sweatshirt extends Clothing
{
    private boolean hood;
    
    public Sweatshirt(String size, String color, boolean hood)
    {
        super(size, color);
        hood = hood;
    }
    
    public boolean hasHood()
    {
        return hood;
    }

}
