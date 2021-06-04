public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    
    public Website()
    {
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }
    
    public Website(String theDomainName, String theTopDomain)
    {
        domain = theDomainName;
        topLevelDomain = theTopDomain;
        numUsers = 0;
    }
    
    public Website(String theDomainName, String theTopDomain, int theNumPeople)
    {
        domain = theDomainName;
        topLevelDomain = theTopDomain;
        numUsers = theNumPeople;
    }
    
    
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}
