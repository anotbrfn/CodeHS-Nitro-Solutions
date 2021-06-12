public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String thisName, int theseCalories)
        {
            name = thisName;
            calories = theseCalories;
        }
        
        //Add getter and setter methods for calories
        public void setName(String thisName)
        {
            name = thisName;
        }
        
        public void setCalories(int theseCalories)
        {
            calories = theseCalories;
        }
        
        public String getName()
        {
            return name;
        }
        
        public int getCalories()
        {
            return calories;
        }
        //Add getter and setter methods for name
        
        
        //Add toString method
    public String toString()
    {
        return name + " have " + calories + " calories";
    }
}
