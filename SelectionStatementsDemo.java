public class SelectionStatementsDemo {
    public static void main(String[] args) {

        // Declare and initialize the student score
        int studentScore = 82;

        // One-way if statement (Passing)
        if (studentScore >= 60) {
            System.out.println("You passed the exam!");
        }

        // Two-way if-else statement (Basic Feedback)
        if (studentScore >= 90) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving!");
        }

        // Nested if statement (Detailed Grading)
        if (studentScore >= 60) {
            if (studentScore >= 90) {
                System.out.println("Grade: A");
            } else {
                if (studentScore >= 75) {
                    System.out.println("Grade: B");
                } else {
                    System.out.println("Grade: C");
                }
            }
        } else {
            System.out.println("Grade: F");
        }

        // Multi-way if-else chain (Alternative Grading)
        if (studentScore >= 90) {
            System.out.println("Multi-way Grade: A");
        } else if (studentScore >= 80) {
            System.out.println("Multi-way Grade: B");
        } else if (studentScore >= 70) {
            System.out.println("Multi-way Grade: C");
        } else if (studentScore >= 60) {
            System.out.println("Multi-way Grade: D");
        } else {
            System.out.println("Multi-way Grade: F");
        }
    }
}
