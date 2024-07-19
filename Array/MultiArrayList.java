package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* multi dimensional ArrayList */
        ArrayList<ArrayList<Integer>> vector = new ArrayList<>();

        /* initialize the multidimensional ArrayList */
        for (int i = 0; i < 3; i++) {
            vector.add(new ArrayList<>());
        }

        /* get the value in the multidimensional ArrayList */
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your " + i + " rows' ");
            for (int j = 0; j < 3; j++) {
                System.out.println("col " + j + "th value: ");
                int n = scan.nextInt();
                vector.get(i).add(n);
            }
        }

        // print directly
        System.out.println("\n\nMultidimensional ArrayList: " + vector);

    }
}
