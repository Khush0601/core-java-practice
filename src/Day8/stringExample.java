package Day8;

public class stringExample {
    public static void main(String[] args) {

        // Creating a String (with spaces at start and end)
        String text = " Hello Java ";

        // length() → returns total number of characters (including spaces)
        System.out.println("Length: " + text.length());

        // charAt(index) → returns the character at the given index (index starts from 0)
        System.out.println("Character at index 1: " + text.charAt(1));

        // equals() → compares content of strings (case-sensitive)
        System.out.println("Equals 'Hello Java': " + text.equals("Hello Java"));

        // equalsIgnoreCase() → compares content ignoring upper/lower case
        System.out.println("Equals Ignore Case: " + text.equalsIgnoreCase(" hello java "));

        // toUpperCase() → converts all characters to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // toLowerCase() → converts all characters to lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // trim() → removes leading and trailing spaces only
        String trimmed = text.trim();
        System.out.println("After trim: '" + trimmed + "'");

        // substring(start, end) → extracts part of string from start index to end-1 index
        System.out.println("Substring (0 to 5): " + trimmed.substring(0, 5));

        // contains() → checks if the string contains given text, returns true or false
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // replace(old, new) → replaces old text with new text
        System.out.println("Replace Java with World: " + trimmed.replace("Java", "World"));
    }
}


