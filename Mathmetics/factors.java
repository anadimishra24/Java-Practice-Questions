package Mathmetics;

import java.util.*;

public class factors {

    // optimized approach: Time Complexity is O(sqrt(n))
    private static ArrayList<Integer> optimizedFactorOfN(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                if(num/i == i){
                    list.add(i);
                }
                else{
                    list.add(i);
                    list.add(num / i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    // brute full approach: Time Complexity is O(n)
    private static ArrayList<Integer> factorOfN(int num) {
        ArrayList<Integer> vector = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                vector.add(i);
            }
        }
        return vector;
    }
    public static void main(String[] args) {
        System.out.println("Find all the factors of the given number.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        ArrayList<Integer> ans = factorOfN(num);
        System.out.println("Approach I: Brute Force O(n), All the factor of " + num + " is: " + ans);

        ArrayList<Integer> res = optimizedFactorOfN(num);
        System.out.println("Approach II: Optimized O(sqrt(n)), All the factor of " + num + " is: " + res);

    }
}

