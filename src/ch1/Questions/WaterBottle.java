package ch1.Questions;

/**
 * Created by User on 17.03.2016.
 */
public class WaterBottle {

    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}
