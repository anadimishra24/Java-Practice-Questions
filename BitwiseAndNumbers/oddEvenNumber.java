package BitwiseAndNumbers;

import java.util.Scanner;


public class oddEvenNumber {
    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println("Check the number is odd or even using bitwise operator\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = input.nextInt();

        if(isOdd(n)){
            System.out.println("Your number " + n + " is an Odd number.");
        }
        else{
            System.out.println("Your number " + n + " is an Even number.");
        }
    }
}
