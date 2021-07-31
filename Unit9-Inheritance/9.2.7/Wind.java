public class Wind extends Instrument
{
    public boolean reed;
    
    public Wind(String name, String family, boolean reed)
    {
        super(name, family);
        this.reed = reed;
    }
    
    public void setReed(boolean r)
    {
        reed = r;
    }
    public boolean getReed()
    {
        return reed;
    }
}
