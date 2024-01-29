package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import static bean.MockData.*;
import static utils.ArrayUtils.printf;

public class Ex03ObjectSorting {
    public static void main(String[] args) {
        Item[] items = mockData();

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                // descending by Id
                // null first
                Integer i1 = item1.getId();
                Integer i2 = item2.getId();

                if (i1 == null && i2 != null) {
                    return -1;
                }

                // i1 != null
                if (i2 == null) {
                    return 1;
                }

                // if (i2 == null) {
                // return -1;
                // }

                // // i2 != null
                // if (i1 == null) {
                // return 1;
                // }

                return i1 - i2;
            }
        });
        printf(items);

    }
}
