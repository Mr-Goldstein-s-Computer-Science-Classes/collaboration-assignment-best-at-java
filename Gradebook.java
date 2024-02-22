import java.util.ArrayList;
import java.util.List;
public class Gradebook {
    private Student student;
    private String assignment;
    private double averageGrade;
    private double maximumGrade;
    private double minimumGrade;
    private double averageOverall;
    private double maxOverall;
    private double minOverall;
    private double studentGrade;

    public Gradebook()
    {
        ArrayList gradeBrook = new ArrayList();
    }
    public void createStudent(String name)
    {
        Student x = new Student(name);
    }
    public void addAssignment(String assignment)
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
    private double getStudentGrade()
    {
        return studentGrade;
    }
}
