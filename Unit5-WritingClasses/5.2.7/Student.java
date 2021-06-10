public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
   public Student(String sFirstName, String sLastName, int sGradeLevel, String sSchool)
   {
       firstName = sFirstName;
       lastName = sLastName;
       gradeLevel = sGradeLevel;
       school = sSchool;
   }
   
   public Student(String sFirstName, String sLastName, int sGradeLevel)
   {
       firstName = sFirstName;
       lastName = sLastName;
       gradeLevel = sGradeLevel;
       if (sGradeLevel > 0 && sGradeLevel < 6)
        {
            school = "elementary school";
        }
       if (sGradeLevel >= 6 && sGradeLevel <=8)
       {
           school = "middle school";
       }
       if (sGradeLevel >=9 && sGradeLevel <=12)
       {
           school = "high school";
       }
   }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}
