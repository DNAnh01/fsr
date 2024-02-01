package stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex03Operations {
    public static void main(String[] args) {
        List<Dish> dishs = DataModel.getDishes();
        dishs.forEach(System.out::println);
        System.out.println("take meat or fish for food");
        dishs.stream()
                .filter(dish -> {
                    if (Kind.MEAT.equals(dish.getKind()) ||
                            Kind.FISH.equals(dish.getKind())) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
