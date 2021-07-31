public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person ed = new Person("Thomas Edison", "February 11, 1847");
        Student al = new Student("Albert Einstein","March 15, 1879", 12, 5.0);
        System.out.println(ed.getName());
        System.out.println(ed.getBirthday());
        System.out.println(al.getName());
        System.out.println(al.getBirthday());
        System.out.println(al.getGrade());
        System.out.println(al.getGpa());
    }
}
