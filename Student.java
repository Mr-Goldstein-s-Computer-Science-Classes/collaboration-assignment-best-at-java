import java.util.List;
import java.util.ArrayList;
public class Student {

    private String name;
    private List<String> assignments;
    private List<Double> assignmentGrades;

    public Student(String name)
    {
        this.name = name;
        assignments = new ArrayList<String>();
        assignmentGrades = new ArrayList<Double>();
    }

    public void addAssignment(String assignName)
    {
        assignments.add(assignName);
    }

    public void gradeAssignment(String assignment, double grade)
    {

    }

    public double getAssignmentGrade(String assignment)
    {

    }

    public double getOverallGrade()
    {

    }

    public String toString()
    {
        return name + ": " + getOverallGrade();
    }

}
