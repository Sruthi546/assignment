import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        // Create an ArrayList with the values
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(a);

        // Convert the ArrayList back to an array (if needed)
        Integer[] shuffledArray = a.toArray(new Integer[a.size()]);

        // Print the shuffled array
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}