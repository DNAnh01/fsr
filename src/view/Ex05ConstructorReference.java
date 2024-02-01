package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import bean.Apple;
import functional.TernaryFunction;

public class Ex05ConstructorReference {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(1, 2, 3);
        List<Apple> firstList = transferToApples(ids, Apple::new);
        firstList.forEach(System.out::println);

        List<String> countries = Arrays.asList("HN", "DN", "QN");
        transferToApples(ids, countries, (id, county) -> new Apple(id, county)).forEach(System.out::println);

        List<String> colors = Arrays.asList("red", "green", "yellow");
        transferToApples(ids, countries, colors, (id, country, color) -> new Apple(id, country, color))
                .forEach(apple -> System.out.println("\u001B[34m" + apple.toString() + "\u001B[0m"));
    }

    private static <T> List<Apple> transferToApples(List<T> ids, Function<T, Apple> function) {
        List<Apple> result = new ArrayList<>();
        for (T id : ids) {
            result.add(function.apply(id));
        }
        return result;
    }

    private static <I, C> List<Apple> transferToApples(List<I> ids, List<C> countries,
            BiFunction<I, C, Apple> biFunction) {
        List<Apple> result = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            result.add(biFunction.apply(ids.get(i), countries.get(i)));
        }
        return result;
    }

    private static <I, Cn, Col> List<Apple> transferToApples(List<I> ids, List<Cn> counties, List<Col> colors,
            TernaryFunction<I, Cn, Col, Apple> ternaryFunction) {
        int len = ids.size();
        List<Apple> result = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            result.add(ternaryFunction.apply(ids.get(i), counties.get(i), colors.get(i)));
        }
        return result;
    }
}
