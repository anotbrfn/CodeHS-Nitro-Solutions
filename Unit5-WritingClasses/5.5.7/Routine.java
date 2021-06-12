public class Routine
{
    private double sleep;
    private double fun;
    private double school;
    private double sports;
    
    public Routine()
    {
        sleep = 0.0;
        fun = 0.0;
        school = 0.0;
        sports = 0.0;
    }
    
    public void setSleep(double hoursSleep)
    {
        sleep = hoursSleep;
    }
    
    public void setFun(double hoursFun)
    {
        fun = hoursFun;
    }
    
    public void setSchool(double hoursSchool)
    {
        school = hoursSchool;
    }
    
    public void setSports(double hoursSports)
    {
        sports = hoursSports;
    }
    
    public void printTotal()
    {
        System.out.println("Weekly totals \n Sleep: " + (sleep * 7));
        System.out.println("School: " + (school * 7));
        System.out.println("Sports: " + (sports * 7));
        System.out.println("Fun: " + (fun * 7));
        double gTotal = (sleep * 7)+(school * 7)+(sports * 7)+(fun * 7);
        System.out.println("Grand total: " + gTotal);
        System.out.println("Hours left over: " + (168 - gTotal));
    }
}
