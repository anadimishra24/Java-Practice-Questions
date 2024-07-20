package Searching;

public class SmallestCharacter_744 {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        // char res = ' ';  // no need to use extra variable
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letters[mid] > target){
                // res = letters[mid];
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        // return res;
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        System.out.println("Leetcode question no: 744");
        char[] letters = {'c','f','j'};
        char target = 'a';

        char ans = nextGreatestLetter(letters, target);
        System.out.println("Smallest char: " + ans);


    }
}

