import java.util.ArrayList;
public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> list)
    {
        ArrayList<String> existing = new ArrayList<String>();
        
        for(int i = 0; i < list.size(); i++)
        {
            String email = list.get(i);
            if(existing.indexOf(email) != -1)
            {
                list.remove(i);
                i--;
            }
            existing.add(email);
        }
    }
    public static void removeAOL(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).indexOf("@aol.com") > -1)
            {
                System.out.println("removing " + list.get(i));
                list.remove(i);
                i--;
            }
        }
    }
    public static boolean containsOnlyEmails(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).indexOf("@") == -1 || list.get(i).indexOf(".") == -1) {
                return false;
            }
        }
        return true;
    }
}
