public class AddFractions 
{
    public static void main(String[] args)
    {
        //Your code goes here! 
        
        int firstNum = 1;
        int firstDen = 2;
        int secNum = 2;
        int secDen = 5;
        
        System.out.println("The numerator of the first fraction is " + firstNum);
        System.out.println("The denominator of the first fraction is " + firstDen);
        System.out.println("The numerator of the second fraction is " + secNum);
        System.out.println("The denominator of the second fraction is " + secDen);
        
        int sumNum = firstNum * secDen + firstDen * secNum;
        int sumDen = firstDen * secDen;
        
        String firstFrac = "" + firstNum + "/" + firstDen;
        String secFrac = "" + secNum + "/" + secDen;
        String sumFrac = "" + sumNum + "/" + sumDen;
        
        System.out.println("The sum of " + firstFrac + " + " + secFrac + " = " + sumFrac); 
    }
}
