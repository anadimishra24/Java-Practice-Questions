package String;

public class palindrome {

    private static boolean isPalindrome (String str) {
        // Remove spaces and convert to lowercase (if case insensitive)
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("The string is palindrome or not");

        String str = "Noon";

        System.out.println("String is: " + str);

        if (isPalindrome(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
