package Package4;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        // * We have to first import the Random class within the library
        Random random = new Random();
        int x = random.nextInt();
        // * To limit the scale or the size of the random number that will generate
        // * We can pass in a value to our next int method
        x = random.nextInt(6)+1; // * Add one because computer start with 0
        System.out.println(x);
    }
}
