package Recursion;

public class removeCharacter {

    private static void removeA(String ans, String str) {
        if(str.isEmpty()){
            System.out.println("String after remove character: " + ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch == 'a'){
            removeA(ans,str.substring(1));
        }
        else{
            /* add the character in the answer and call for the next
            part (if we do ch+ans it give the string without that character but in reverse order*/
            removeA(ans + ch,str.substring(1));
        }
    }

    public static void main(String[] args) {

        System.out.println("\nRemove the specific character from string.\n");

        String str = new String();

        str = "Anaadi";
        System.out.println("String: " + str);

        String ans = "";

        removeA(ans, str);

        //System.out.println("String after remove 'a': " + str);
    }
}
