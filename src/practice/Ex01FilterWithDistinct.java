package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Apple;
import bean.Dish;
import model.DataModel;

import static utils.PredicateUtils.*;

public class Ex01FilterWithDistinct {
        public static void main(String[] args) {
                // distinct: 1,2,3,4,5
                // unique: 3 5
                List<Integer> digits = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5);
                List<Integer> d1 = digits.stream()
                                .distinct() // hashing
                                .collect(Collectors.toList());
                d1.forEach(digit -> System.out.print(digit + " "));

                System.out.println("\n=========");

                Set<Integer> d2 = digits.stream()
                                .collect(Collectors.toSet());
                d2.forEach(digit -> System.out.print(digit + " "));

                System.out.println("==========");
                // override hashcode, equals by calories
                // distinct = filter by non duplicate elements
                List<Dish> menu = DataModel.getDishes();
                menu.stream().distinct()
                                .forEach(System.out::println);

                System.out.println("==========");

                // distinct by kind(key/property)

                menu.stream().filter(distinctByKey(dish -> dish.isVegetarian()))
                                .forEach(System.out::println);

                System.out.println("=========");
                List<Apple> inventory = DataModel.getApples();
                inventory.stream()
                                .filter(distinctByKey(Apple::getCountry))
                                .forEach(System.out::println);
        }
}
