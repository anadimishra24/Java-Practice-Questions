package BitwiseAndNumbers;

public class mask {
    public static void main(String[] args) {
        System.out.println("\nIn this section, we tried questions of bit manipulation with masking.");

        int number = -4; // Binary: 11111111111111111111111111111100
        int result = number >>> 1; // Binary: 01111111111111111111111111111110

        System.out.printf("Result: " + result);
    }
}
