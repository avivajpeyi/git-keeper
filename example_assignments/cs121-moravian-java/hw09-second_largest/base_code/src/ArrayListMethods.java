import java.util.ArrayList;

/**
 * This is a class of static utility methods for use with ArrayLists of Integer
 */
public class ArrayListMethods {
    /**
     * Given an ArrayList of Integers, return the largest value in the list. If the list
     * is empty, return 0
     */
    public static int maxElement(ArrayList<Integer> ints) {
        // Integer.MIN_VALUE gives you the smallest possible value for an int
        int max = Integer.MIN_VALUE;

        for (int i : ints) {
            if (i > max)
                max = i;
        }

        return max;
    }

    // add the other method here

}
