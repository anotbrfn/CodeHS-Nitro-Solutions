import java.util.ArrayList;
public class ArrayListMethods
{
    public static void print(ArrayList<String> array)
    {
        for(String s : array)
        {
            System.out.println(s);
        }
    }
    public static void condense(ArrayList<String> array)
    {
        for(int i = 0; i < array.size() - 1; i++)
        {
            array.set(i, array.get(i) + array.get(i + 1));
            array.remove(i + 1);
        }
    }
    public static void duplicate(ArrayList<String> array)
    {
        for(int i = 0; i < array.size(); i += 2)
        {
            array.add(i, array.get(i));
        }
    }
}
