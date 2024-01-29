package sorting.collator;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

import utils.ArrayUtils;

public class Ex01Collator {
    public static void main(String[] args) {
        // UpperCass, LowerCase, Sign, UnSign
        String[] letters = { "A", "Ấ", "a", "b", "ấ", "ẹ", "B", "E" };
        System.out.print("Prototype ==> ");
        ArrayUtils.printf(letters);

        Arrays.sort(letters);

        System.out.print("\nDefault Sort ==> ");
        ArrayUtils.printf(letters);

        // ==============================

        Collator collator = Collator.getInstance(Locale.US);
        collator.setStrength(Collator.PRIMARY);

        Arrays.sort(letters, collator);

        System.out.print("\nCollator PRIMARY ==> ");
        ArrayUtils.printf(letters);

        // ==============================

        collator.setStrength(Collator.SECONDARY);

        Arrays.sort(letters, collator);

        System.out.print("\nCollator SECONDARY ==> ");
        ArrayUtils.printf(letters);

        // ==============================

        collator.setStrength(Collator.TERTIARY);

        Arrays.sort(letters, collator);

        System.out.print("\nCollator TERTIARY ==> ");
        ArrayUtils.printf(letters);
    }
}
