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
        assignmentGrades.add(null);
    }

    public void gradeAssignment(String assignment, double grade)
    {
        int index = assignments.indexOf(assignment);
        assignmentGrades.set(index, grade);

    }

    public double getAssignmentGrade(String assignment)
    {
        int index = assignments.indexOf(assignment);
        return assignmentGrades.get(index);
    }

    public double getOverallGrade()
    {
        if(assignmentGrades != null)
        {
            for(int i = 0; i < assignments.size(); i++)
            {
                
            }
        }
    }

    public String toString()
    {
        return name + ": " + getOverallGrade();
    }

}
