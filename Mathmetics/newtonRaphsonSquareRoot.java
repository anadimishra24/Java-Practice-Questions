package Mathmetics;

public class newtonRaphsonSquareRoot {

    /*
    Newton Raphson: The Newton-Raphson method is an iterative numerical technique used to find approximate solutions
                    to equations of the form 𝑓(𝑥)=0. It’s particularly useful for finding roots of real-valued functions.
                    This method can be applied to various types of problems, including finding square roots,
                    solving nonlinear equations, and optimizing functions.


     How does it work?
    */

    public static double newtonSqrt(int n){
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println("Find the square root of number using Newton Raphson method.");
        System.out.println(newtonSqrt(40));
    }
}
