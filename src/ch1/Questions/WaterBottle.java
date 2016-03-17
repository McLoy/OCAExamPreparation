package ch1.Questions;

/**
 * Created by User on 17.03.2016.
 */
public class WaterBottle {

    private String brand;
    private boolean empty;

    public static void main(String[] args) {

//        short numPets = 5;
//        int numGrains = 5.6;
//        String name = "Scruffy";
//        numPets.length();
//        numGrains.length();
//        name.length();

        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}
