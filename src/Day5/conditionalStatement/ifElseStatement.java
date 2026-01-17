package Day5.conditionalStatement;

// if–else if–else is used to check multiple conditions
// Conditions are evaluated from top to bottom
// As soon as one condition becomes true, its block executes
// Remaining conditions are skipped
// The else block runs only when none of the conditions are true

public class ifElseStatement {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");

        } else if (marks >= 75) {
            System.out.println("Grade B");

        } else if (marks >= 60) {
            System.out.println("Grade C");

        } else {
            System.out.println("Fail");
        }
    }
}
