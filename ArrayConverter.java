import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverter {
    // Converts an array to an ArrayList
    public void arrayToArrayList() {
        String[] arr = {"Apple", "Banana", "Cherry"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Converted Array to ArrayList: " + list);
    }

    public void arrayListToArray() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        String[] arr = list.toArray(new String[0]);

        System.out.println("Converted ArrayList to Array: " + Arrays.toString(arr));
    }
}
