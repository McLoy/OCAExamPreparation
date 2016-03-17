import ch1.Mouse;

/**
 * Created by User on 16.03.2016.
 */
public class OCA {

    public static int bitesOfCheese;
    public static void eatIfHungry(boolean hungry){
        if (hungry){
            bitesOfCheese = 18;
        }
        System.out.println(bitesOfCheese);
    }

    public static void eatMore(boolean hungry, int amountOfFood){
        int roomInBelly = 5;
        if (hungry){
            boolean timeToEat = true;
            while (amountOfFood > 0){
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
//                System.out.println(amountOfFood);
            }
        }
        System.out.println(amountOfFood);
    }

    public static void main(String[] args) {

        //initialization
        int x = 10;
        int y = 5;
        int relay = x+y;
        System.out.println(relay);
        ch1.LocalVar.findAnswer(true);
        eatIfHungry(true);
        eatMore(true, 20);


    }

}
