package ch1;

/**
 * Created by User on 17.03.2016.
 */
public class Finalizer {

    protected void finalize(){
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}
