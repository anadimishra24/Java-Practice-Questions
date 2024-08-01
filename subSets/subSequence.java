package subSets;

import java.util.ArrayList;

public class subSequence {

    // Approach II: Return the ArrayList of subsequences
    private static ArrayList<String> subSeqReturn(String str, String sets) {
        if(str.isEmpty()){
            ArrayList<String> subSets = new ArrayList<>();
            subSets.add(sets);
            return subSets;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subSeqReturn(str.substring(1), sets + ch);
        ArrayList<String> right = subSeqReturn(str.substring(1), sets);

        left.addAll(right);

        return left;
    }


    // Approach I: Print the subsequences
    private static void subSeq(String str, String ans) {
        if(str.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);

        /* now we have two options either take the charter or leave the character. */

        // take the character
        subSeq(str.substring(1), ans+ch);

        // leave the character
        subSeq(str.substring(1), ans);

    }

    public static void main(String[] args) {
        System.out.println("Print all the subsequences of the string.\n");

        String str = "abc";
        String ans = " ";

        subSeq(str, ans);
        String set = " ";

        ArrayList<String> result = subSeqReturn(str, set);

        System.out.println("\n\nSub sequence of the string: " + result);
    }
}
