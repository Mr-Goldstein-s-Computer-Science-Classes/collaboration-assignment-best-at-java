public class Main {
    public static void main(String[] args) {

        Gradebook grades = new Gradebook();

        //Create Students

        grades.addAssignment("Stacks And Queues Station Activity");
        grades.addAssignment("Stacks and queues programs");
        grades.addAssignment("Stacks and queues quiz");
        grades.addAssignment("Github Exploration");

        grades.gradeAssignment("Stacks and queues station", "Tyler", 94);


    }
}
