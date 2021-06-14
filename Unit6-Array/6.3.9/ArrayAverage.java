public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
     int total = 0;
     for(int val : values)
     {
         total += val;
     }
     double avg = (double)total / values.length;
     return avg;
   }
}
