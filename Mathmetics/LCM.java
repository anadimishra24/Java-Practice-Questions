package Mathmetics;

import java.util.Scanner;

import static Mathmetics.HCF_GCD.gcd;

public class LCM {

    /*
        Here, we used our gcd function that already writer in this Mathematics package.

        We know that the relation between LCM and GCD i.e.
        LCM(a,b) x GCD(a,b) = a x b

        So ,far finding the relation: LCM = axb / gcd
    */
    private static int lcm(int a, int b) {

        return a*b / gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("LCM of numbers");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter a: ");
        int b = input.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
    }
}
