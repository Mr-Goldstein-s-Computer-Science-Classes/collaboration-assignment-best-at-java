import java.util.ArrayList;
import java.util.List;
public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> assignments = new ArrayList<>();


    public Gradebook()
    {
        ArrayList<String> assignment = new ArrayList<>();
        this.assignments = assignment;
    }
    private ArrayList<Student> getStudents()
    {
        return students;
    }
    private ArrayList<String> getAssignments()
    {
        return assignments;
    }

    public void createStudent(String name)
    {
        Student x = new Student(name);
        students.add(x);
    }
    public void addAssignment(String assignment)
    {
        getAssignments().add(assignment);
    }
    public Student getStudent(String studentName)
    {

    }
    public void gradeAssignment(String assignment, String studentName, double grade)
    {

    }
    public double getAverageGrade(String assignment)
    {
        for(doubl)
    }
    public double getMinimumGrade(String assignment)
    {
        return minimumGrade;
    }
    public double getMaximumGrade(String assignment)
    {
        return maximumGrade;
    }
    public double getAverageOverall()
    {
        return averageOverall;
    }
    public double getMaxOverall()
    {
        return maxOverall;
    }
    public double getMinOverall()
    {
        return minOverall;
    }
    public double getStudentGrade(String p)
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
