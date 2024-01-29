package sorting.object;

import static java.util.Comparator.*;

import static bean.MockData.mockData;
import static utils.ArrayUtils.printf;

import java.util.Arrays;

import bean.Item;

public class Ex04SortingInJava08Step2 {
    public static void main(String[] args) {
        Item[] items = mockData();

        printf(items);

        // nullsFirst(naturalOrder || reverseOrder)

        /**
         * Sắp xếp theo giá (price) giảm dần, với các phần tử có giá trị null được xếp
         * trước các phần tử có giá trị không null.
         * Nếu giá (price) bằng nhau, sắp xếp theo ID tăng dần, với các phần tử có giá
         * trị null được xếp sau các phần tử có giá trị không null.
         */
        Arrays.sort(items,
                nullsFirst(
                        comparing(Item::getPrice, nullsFirst(reverseOrder())))
                        .thenComparing(Item::getId, nullsLast(naturalOrder())));

        printf(items);

        System.out.println("items after sorted");

    }
}
