public class Student
{
    private String name;
    private int classYear;
   
   // Constructor goes here
    public Student(String name, int year)
    {
        this.name = name;
        classYear = year;
    }
   
    public String getName(){
       return name;
    }
   
    public int getClassYear(){
       return classYear;
    }
   
    public String toString(){
        return name + ", class of " + classYear;
    }
}
