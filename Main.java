public class Main {
    public static void main(String[] args) {

        Gradebook grades = new Gradebook();

        grades.createStudent("Tyler");
        grades.createStudent("James");
        grades.createStudent("Ethan");
        grades.createStudent("Scotty");
        grades.createStudent("David");
        grades.createStudent("Patrick");

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

        grades.gradeAssignment("Github Exploration", "Tyler", 96);
        grades.gradeAssignment("Github Exploration", "James", 43);
        grades.gradeAssignment("Github Exploration", "Ethan", 100);
        grades.gradeAssignment("Github Exploration", "Scotty", 97);
        grades.gradeAssignment("Github Exploration", "David", 28);
        grades.gradeAssignment("Github Exploration", "Patrick", 100);

        System.out.println(grades.getMaximumGrade("Stacks And Queues Station Activity"));
        System.out.println(grades.getMaximumGrade("Stacks and queues programs"));
        System.out.println(grades.getMaximumGrade("Stacks and queues quiz"));
        System.out.println(grades.getMaximumGrade("Github Exploration"));

        System.out.println(grades.getMinimumGrade("Stacks And Queues Station Activity"));
        System.out.println(grades.getMinimumGrade("Stacks and queues programs"));
        System.out.println(grades.getMinimumGrade("Stacks and queues quiz"));
        System.out.println(grades.getMinimumGrade("Github Exploration"));

        System.out.println(grades.getAverageGrade("Stacks And Queues Station Activity"));
        System.out.println(grades.getAverageGrade("Stacks and queues programs"));
        System.out.println(grades.getAverageGrade("Stacks and queues quiz"));
        System.out.println(grades.getAverageGrade("Github Exploration"));

        System.out.println(grades.getMaxOverall());
        System.out.println(grades.getMinOverall());
        System.out.println(grades.getAverageOverall());

        System.out.println(grades.toString());

        System.out.println(grades.getStudent("Tyler"));
        System.out.println(grades.getStudent("James"));
        System.out.println(grades.getStudent("Ethan"));
        System.out.println(grades.getStudent("Scotty"));
        System.out.println(grades.getStudent("David"));
        System.out.println(grades.getStudent("Patrick"));

    }
}