public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double angle1 = 0.0;
        double angle2 = Math.PI / 2;
        double angle3 = Math.PI;
        
        double cos1 = Math.round(Math.cos(angle1) * 100) / 100.0;
        double cos2 = Math.round(Math.cos(angle2) * 100) / 100.0;
        double cos3 = Math.round(Math.cos(angle3) * 100) / 100.0;
        
        double sin1 = Math.round(Math.sin(angle1) * 100) / 100.0;
        double sin2 = Math.round(Math.sin(angle2) * 100) / 100.0;
        double sin3 = Math.round(Math.sin(angle3) * 100) / 100.0;
        
        System.out.println(angle1 + ": " + cos1 + ", " + sin1);
        System.out.println(angle2 + ": " + cos2 + ", " + sin2);
        System.out.println(angle3 + ": " + cos3 + ", " + sin3);
    }
}
