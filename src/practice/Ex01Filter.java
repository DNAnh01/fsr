package practice;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex01Filter {
    public static void main(String[] args) {
        List<Dish> dishs = DataModel.getDishes();
        dishs.forEach(System.out::println);

        System.out.println("\u001B[31m" + "take meat for food" + "\u001B[0m");
        dishs.stream()
                .filter(dish -> {
                    if (Kind.MEAT.equals(dish.getKind())) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
