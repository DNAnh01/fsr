package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex02StringSortingInJava {
    public static void main(String[] args) {
        String[] sequences = { "5", "0", "4", null, "2", "8", null, "10", "6" };

        // Arrays.sort(Object[])
        // --> Object is a Comparable, override compareTo(o), --> ASC || DESC

        // Arrays.sort(T[], Comparator<T>)
        // --> int compare(T o1, T o2);
        // --> Object is a normal class, ASC|DESC, check null --> handle in Comparator
        // parameter

        // String implements Comparable<String> OK
        // Support ASC
        // NO DESC, NO NPE handling
        // Arrays.sort(sequences);

        Arrays.sort(sequences, new Comparator<String>() {
            // o1: previous
            // o2: next
            // compare(o1, o2) > 0 --> o1 > o2
            // compare(o1, o2) = 0 --> o1 = o2
            // compare(o1, o2) < 0 --> o1 < o2
            @Override
            public int compare(String o1, String o2) {
                // null first
                /*
                 * if (o2 == null && o1 != null) {
                 * return 1;
                 * }
                 * 
                 * // o2 != null
                 * if (o1 == null) {
                 * return -1;
                 * }
                 */

                // null last
                if (o2 == null) {
                    return -1;
                }

                // o2 != null
                if (o1 == null) {
                    return 1;
                }
                return o2.compareTo(o1);
            }

        });

        ArrayUtils.printf(sequences);
    }
}
