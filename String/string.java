package String;

public class string {
    public static void main(String[] args) {

        // System.out.printf("String %s ", "Anadi");
        String name = "Anadi Mishra";
        System.out.println(name);

        // here string is still immutable, first a points to "Anadi" but after that we change the value now it point to "Mishra"
        String a = "Anadi";
        System.out.println(a);
        a = "Mishra";
        System.out.println(a);
    }
}
