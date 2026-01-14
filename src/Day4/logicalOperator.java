package Day4;

// Logical operators are used to combine multiple conditions
// They work with boolean values (true / false)
// Mostly used with relational operators

public class logicalOperator {
    public static void main(String[] args) {

        int age = 22;
        int marks = 75;

        // Logical AND (&&)
        // Returns true only if BOTH conditions are true
        System.out.println("Age >= 18 AND Marks >= 60 : " + (age >= 18 && marks >= 60));

        // Logical OR (||)
        // Returns true if ANY one condition is true
        System.out.println("Age >= 18 OR Marks >= 80 : " + (age >= 18 || marks >= 80));
        // true || false → true

        // Logical NOT (!)
        // Reverses the result
        boolean isPassed = true;
        System.out.println("NOT isPassed : " + (!isPassed));
        // !true → false

        // Combining relational and logical operators
        int salary = 30000;

        boolean isEligible =
                (age >= 21 && marks >= 70) || salary >= 25000;

        System.out.println("Is Eligible: " + isEligible);
    }
}
