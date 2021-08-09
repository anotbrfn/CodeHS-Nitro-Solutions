public class OnlineCompany extends Company{

    private String webAddress;

    public OnlineCompany(String name, String webAddress){
        super(name);
        this.webAddress = webAddress;
    }

    //Return the website address

    public String address(){
        return webAddress;
    }

    /**
    * Remember To get name from superclass, use super.getName()
    * 
    * Example Output:
    * CodeHS
    * www.codehs.com
    */
    
    public String toString(){
        String rethis = "";
        rethis += super.getName() + "\n";
        rethis += address();
        return rethis;
    }
}
