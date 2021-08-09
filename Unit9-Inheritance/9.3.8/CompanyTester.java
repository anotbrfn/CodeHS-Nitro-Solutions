public class CompanyTester
{
    public static void main(String[] args)
    {
        Company a = new Company("a", "b", "c", "d");
        OnlineCompany b = new OnlineCompany("e", "f");
        System.out.println(a + "\n" + b);
    }
}
