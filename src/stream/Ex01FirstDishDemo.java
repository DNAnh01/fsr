package stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex01FirstDishDemo {
    public static void main(String[] args) {
        List<Dish> dishs = DataModel.getDishes();
        // dishs.forEach(System.out::println);

        dishs.stream()
                .filter(dish -> dish.getCalories() > 400)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("\u001B[34m" + dish.toString() + "\u001B[0m"));
        System.out.println("--------------");
        dishs.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList())
                .forEach(name -> System.out.println("\u001B[34m" + name + "\u001B[0m"));
        System.out.println("--------------");
        dishs.stream()
                .filter(dish -> Kind.MEAT.equals(dish.getKind()))
                .map(dish -> new Dish(dish.getId(), dish.getName(), dish.getKind()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
