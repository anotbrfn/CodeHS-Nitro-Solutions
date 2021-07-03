import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
    
    public void add(Musician m)
    {
        if(!m.getIsPlatinum())
        {
            System.out.println("Sorry, " + m.getName() + " does not qualify for Top 10");
            return ;
        }
        if(top10.size() < 10) {
            top10.add(m);
        }
        else {
            replace(m);
        }
    }
    public void replace(Musician toAdd)
    {
        int minWeeksTop40 = 1000;
        int minWeeksTop40Index = 0;
        for(int i = 0; i < top10.size(); i++)
        {
            Musician m = top10.get(i);
            if(m.getWeeksInTop40() < minWeeksTop40)
            {
                minWeeksTop40 = m.getWeeksInTop40();
                minWeeksTop40Index = i;
            }
        }
        if(toAdd.getWeeksInTop40() <= minWeeksTop40)
        {
            System.out.println("Sorry, " + toAdd.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
        else
        {
            System.out.println("The musician " + top10.get(minWeeksTop40Index).getName() + " has been replaced by " + toAdd.getName() + ".");
            top10.set(minWeeksTop40Index, toAdd);
        }
    }
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
