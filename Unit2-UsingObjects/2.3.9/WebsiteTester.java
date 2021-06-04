public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website website1 = new Website();
        Website website2 = new Website("goodSchool", "edu");
        Website website3 = new Website("codehs", "com", 1000000);
        
        System.out.println(website1);
        System.out.println(website2);
        System.out.println(website3);
    }
}
