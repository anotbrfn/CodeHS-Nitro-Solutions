import java.util.Arrays;

public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
        int mostImprovement = 0;
        int mostImprovedIndex = 0;
        for(int i = 0; i < students.length; i++)
        {
            if(students[i] != null && students[i].getExamRange() > mostImprovement)
            {
                mostImprovement = students[i].getExamRange();
                mostImprovedIndex = i;
            }
        }
        return students[mostImprovedIndex];
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < students.length; i++)
        {
            if(students[i] != null)
            {
                System.out.println(students[i]);
            }
            
        } 
        
    }
}
