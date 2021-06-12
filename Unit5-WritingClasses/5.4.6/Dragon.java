public class Dragon 
{
    private int level;
    private String attack;
    
    // Write the constructor here!
    public Dragon (int level, String attack)
    {
        this.level = level;
        this.attack = attack;
        
    }
    // Put getters here
    public int getLevel()
    {
        return level;
    }
    public String getAttack()
    {
        return attack;
    }
    // Put other methods here
    public String fight()
    {
        String result = "";
        
        for(int i = 0; i < level; i++)
        {
            result += attack;
        }
        return result;
        
    }

}
