package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import utils.ArrayUtils;

import static bean.MockData.*;

public class Ex04SortingInJava08 {
    public static void main(String[] args) {
        Item[] items = mockData();

        // Sorting ASC|DESC by properties(id)

        // Step1: Using lambda
        // Arrays.sort(items, (c1, c2) -> {
        // return c1.getId().compareTo(c2.getId());
        // });

        // printf(items);

        /*
         * public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
         * Function<? super T, ? extends U> keyExtractor)
         * {
         * Objects.requireNonNull(keyExtractor);
         * return (Comparator<T> & Serializable)
         * (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
         * (c1, c2) -> c1.getId().compareTo(c2.getId());
         * }
         */

        // Step2: Using Comparator available function ==> Method Reference
        // Function<Item, Double> keyExtractor = item -> item.getPrice();
        // Function<Item, Double> keyExtractor1 = Item::getPrice;

        // Arrays.sort(items, Comparator.comparing(Item::getPrice));

        Arrays.sort(items,
                Comparator
                        .nullsFirst(
                                Comparator.comparing(
                                        Item::getId,
                                        Comparator.nullsFirst(
                                                Comparator.naturalOrder())))
                        .thenComparing(
                                Item::getName,
                                Comparator.nullsLast(
                                        Comparator.reverseOrder())));

        ArrayUtils.printf(items);
    }
}
