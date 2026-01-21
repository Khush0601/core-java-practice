package Day8;

public class twoDArray {
    public static void main(String[] args) {

        // Creating & initializing 2D array
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60}
        };

        //  Accessing elements
        System.out.println("First element: " + numbers[0][0]);
        System.out.println("Last element: " + numbers[1][2]);

        // Updating an element
        numbers[0][1] = 25;

        // Accessing all elements
        System.out.println("All elements of 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

