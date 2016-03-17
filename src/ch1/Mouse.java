package ch1;

/**
 * Created by User on 17.03.2016.
 */
public class Mouse {
    static int MAX_LENGTH = 5;
    int length;
    public void grow(int inches){
        if (length < MAX_LENGTH){
            int newSize = length + inches;
            length = newSize;
        }
    }
}
