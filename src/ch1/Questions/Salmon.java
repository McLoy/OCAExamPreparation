package ch1.Questions;

/**
 * Created by User on 17.03.2016.
 */
public class Salmon {
    int count;
    public void Salmon(){
        count = 4;
    }

    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.count);
    }
}
