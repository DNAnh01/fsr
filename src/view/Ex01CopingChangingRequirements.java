package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.DataModel;

public class Ex01CopingChangingRequirements {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();
        filterApples(inventory, apple -> "green".equals(apple.getColor()))
                .forEach(System.out::println);

        filterApples(inventory, apple -> apple.getWeight() > 300.0)
                .forEach(System.out::println);

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> rs = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                rs.add(apple);
            }
        }
        return rs;
    }

}
