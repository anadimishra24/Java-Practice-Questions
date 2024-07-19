package Array;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("The array list is same as we use vector in cpp");

        ArrayList<Integer> vector = new ArrayList<>(2);  // it not depends on the initial size that is 2

        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Original Array: " + vector);

        // change 0 index value
        vector.set(0,100);
        System.out.println("After updation: " + vector);

        System.out.println("********** Take the user input *********");
        ArrayList<Integer> list = new ArrayList<>(1);  // it not depends on the initial size that is 1
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your " + i + "th value: ");
            int n = scan.nextInt();
            list.add(n);
        }

        //print the list by loop
        System.out.print("list is print by loop: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        // print directly
        System.out.println("\n\nlist is print directly: " + list);

    }
}
