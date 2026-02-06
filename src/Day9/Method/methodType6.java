package Day9.Method;
//Method with ARRAY as parameter
public class methodType6 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        printArray(numbers);
    }
}

