import java.util.ArrayList;
import java.util.List;
public class Gradebook {
    private ArrayList<String> gradeBook;
    private Student student;
    private String assignment;
    private double averageGrade;
    private double maximumGrade;
    private double minimumGrade;
    private double averageOverall;
    private double maxOverall;
    private double minOverall;
    private double studentGrade;
    private ArrayList<Student> students = new ArrayList<>();

    public Gradebook()
    {
        ArrayList<String> assignments = new ArrayList();
    }
    private ArrayList<String> getGradeBook()
    {
        return gradeBook;
    }
    public void createStudent(String name)
    {
        Student x = new Student(name);
        students.add(x);
    }
    public void addAssignment(String assignment)
    {
        .add(assignment);
    }
    public Student getStudent(String studentName)
    {

    }
    public void gradeAssignment(String assignment, String studentName, double grade)
    {

    }
    public double getAverageGrade()
    {
        return averageGrade;
    }
    public double getMinimumGrade()
    {
        return minimumGrade;
    }
    private double getMaximumGrade()
    {
        return maximumGrade;
    }
    private double getAverageOverall()
    {
        return averageOverall;
    }
    private double getMaxOverall()
    {
        return maxOverall;
    }
    private double getMinOverall()
    {
        return minOverall;
    }
    private double getStudentGrade(String p)
    {
        return
    }
    private ArrayList<Student> getListStudents()
    {
        ArrayList<Student> list = new ArrayList<Student>();
        for(Student y: list)

    }
    public String toString()
    {
        for(String x: getGradeBook())
        {
            System.out.println(x + ": ");
            x.get

        }
    }
}
