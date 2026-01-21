package Day8;

public class arrayExample {
    public static void main(String[] args) {

        // Creating an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Updating array element
        numbers[1] = 25;
        System.out.println("Updated second element: " + numbers[1]);

        // Accessing all elements using for loop
        System.out.println("All elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Accessing all elements using for-each loop
        System.out.println("\nAll elements using for-each loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

