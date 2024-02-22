public class Main {
    public static void main(String[] args) {

        Gradebook grades = new Gradebook();

        //Create Students

        grades.addAssignment("Stacks And Queues Station Activity");
        grades.addAssignment("Stacks and queues programs");
        grades.addAssignment("Stacks and queues quiz");
        grades.addAssignment("Github Exploration");

        grades.gradeAssignment("Stacks and queues station", "Tyler", 94);
        grades.gradeAssignment("Stacks and queues station", "James", 14);
        grades.gradeAssignment("Stacks and queues station", "Ethan", 5);
        grades.gradeAssignment("Stacks and queues station", "Scotty", 100);
        grades.gradeAssignment("Stacks and queues station", "David", 0);
        grades.gradeAssignment("Stacks and queues station", "Patrick", 79);

        grades.gradeAssignment("Stacks and queues programs", "Tyler", 100);
        grades.gradeAssignment("Stacks and queues programs", "James", 64);
        grades.gradeAssignment("Stacks and queues programs", "Ethan", 100);
        grades.gradeAssignment("Stacks and queues programs", "Scotty", 101);
        grades.gradeAssignment("Stacks and queues programs", "David", 26);
        grades.gradeAssignment("Stacks and queues programs", "Patrick", 99);

        grades.gradeAssignment("Stacks and queues quiz", "Tyler", 100);
        grades.gradeAssignment("Stacks and queues quiz", "James", 100);
        grades.gradeAssignment("Stacks and queues quiz", "Ethan", 100);
        grades.gradeAssignment("Stacks and queues quiz", "Scotty", 87);
        grades.gradeAssignment("Stacks and queues quiz", "David", 92);
        grades.gradeAssignment("Stacks and queues quiz", "Patrick", 83);

        grades.gradeAssignment("Stacks and queues quiz", "Patrick", 83);


    }
}
