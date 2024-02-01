package stream;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public class Ex02TraversableOnce {
    public static void main(String[] args) {
        List<Dish> dishes = DataModel.getDishes();
        dishes.forEach(System.out::println);

        // Why we collect to list after manipulate data ?
        // Why don't we keep data in the stream at the moment ?
        // --> Stream traversable once

        // 3. Get name of dishes which are vegie food
        Stream<String> veggieDishes = dishes.stream() // Stream<Dish>
                .filter(dish -> dish.isVegetarian()) // Stream<Dish>
                .map(Dish::getName); // Stream<String>

        veggieDishes.forEach(System.out::println);
    }
}
