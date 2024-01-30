package collection.list.java.arraylist;

import java.util.ArrayList;
import java.util.List;

import utils.CollectionUtils;

public class Ex04AddRemoveRetail {
    public static void main(String[] args) {
        List<Integer> one = createList(1, 2, 3, 4, 5);
        List<Integer> two = createList(4, 5, 6, 7);

        // addAll --> Hợp
        List<Integer> addAllResult = new ArrayList<>(one);
        addAllResult.addAll(two);
        CollectionUtils.printInteger(addAllResult);

        System.out.println("===============");

        // removeAll --> Hiệu
        List<Integer> removeAllResult = new ArrayList<>(one);
        removeAllResult.removeAll(two);
        CollectionUtils.printInteger(removeAllResult);

        System.out.println("===============");

        // retailAll --> Giao
        List<Integer> retailAllResult = new ArrayList<>(one);
        retailAllResult.retainAll(two);
        CollectionUtils.printInteger(retailAllResult);

    }

    private static List<Integer> createList(Integer... nums) {
        List<Integer> rs = new ArrayList<>();
        for (Integer num : nums) {
            rs.add(num);
        }
        return rs;
    }
}
