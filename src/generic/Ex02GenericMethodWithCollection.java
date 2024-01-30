package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodWithCollection {
    public static void main(String[] args) {
        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> points = Arrays.asList(5.6d, 8.8d, 9.4d);
        List<String> codes = Arrays.asList("IT05", "XK12", "TT77");
        List<Object> anything = Arrays.asList("IT05", 15, 22d);

        printf(digits);
        printf(points);
        // printf(codes);
        // printf(anything);

        // printfAsWildCard(codes);
        printfAsWildCard(anything);
    }

    // List<Object> elements = List<Integer> digits
    // List<Object> --> parameter List<Object>
    private static <Element extends Number> void printf(List<Element> elements) {
        for (Element element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // extends: Giới hạn trên
    // super: Giới hạn dưới
    private static void printfAsWildCard(List<? super Character> elements) {
        for (Object element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
