package Recursion;

public class main {

    // example of head recursion
    private static void headRecursion(int n) {
        if (n > 5) {
            return;
        }

        headRecursion(n + 1);
        System.out.println(n);
    }

    // example of tail recursion
    private static void tailRecursion(int n) {
        if(n > 5){
            return;
        }

        System.out.println(n);
        tailRecursion(n+1);
    }

    public static void main(String[] args) {
        System.out.println("starting of recursion");

        //print the number 1 to 5
        int n = 1;

        System.out.println("Head recursion: ");
        headRecursion(n);
        System.out.println("\n---------------------------\n");
        System.out.println("Tail recursion: ");
        tailRecursion(n);


    }
}
