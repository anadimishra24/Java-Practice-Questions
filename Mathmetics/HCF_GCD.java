package Mathmetics;

import java.util.Scanner;

public class HCF_GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("HCF and GCD of numbers");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter a: ");
        int b = input.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
