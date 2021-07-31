public class Strings extends Instrument
{
    private boolean bow;
    public Strings(String name, boolean bow)
    {
        super(name, "Strings");
        this.bow = bow;
    }
    
    public boolean usesBow()
    {
        return bow;
    }
    public void setBow(boolean b)
    {
        bow = b;
    }
       
}
