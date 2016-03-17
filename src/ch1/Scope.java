package ch1;

/**
 * Created by User on 17.03.2016.
 */
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
