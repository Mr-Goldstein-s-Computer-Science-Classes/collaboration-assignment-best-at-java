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
    private String getStudentName
    {

    }
    public Student getStudent(String studentName)
    {
        for(Student x: students)
        {
            if(studentName.equals(x.))
        }
    }
    public void gradeAssignment(String assignment, String studentName, double grade)
    {

    }
    public double getAverageGrade(String assignment) {
        for (String x : assignments)
        {

        }
    }
    public double getMinimumGrade(String assignment)
    {
    }
    public double getMaximumGrade(String assignment)
    {
    }
    public double getAverageOverall()
    {
    }
    public double getMaxOverall()
    {
    }
    public double getMinOverall()
    {
    }
    public double getStudentGrade(String p)
    {

    }
    private ArrayList<Student> getListStudents()
    {
        ArrayList<Student> list = new ArrayList<Student>();


    }
    public String toString()
    {

    }
}
