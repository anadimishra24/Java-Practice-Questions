package String;

public class removeCharacter {

    // Method to remove all occurrences of a specific character from a string
    private static String removeCharacter(String str, char charToRemove) {

        // Use a StringBuilder to build the resulting string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the original string
        for (char ch : str.toCharArray()) {
            // Append character to result if it is not the character to remove
            if (ch != charToRemove) {
                result.append(ch);
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("\nRemove the specific character from the string.\n");

        String str = "bacaadaaeaa";
        System.out.println("String: " + str);

        // Call removeCharacter method to remove 'a'
        String resultStr = removeCharacter(str, 'a');

        System.out.println("String after removing 'a': " + resultStr);
    }
}
