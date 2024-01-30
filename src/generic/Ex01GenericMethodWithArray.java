package generic;

import javax.swing.text.html.parser.Element;

public class Ex01GenericMethodWithArray {
    public static void main(String[] args) {
        Integer[] orders = { 1, 2, 3, 4, 5 };
        Double[] points = { 7.8d, 5.6d, 9.8d, 8.8d };
        String[] codes = { "IT01", "SP02", "KT15" };

        // printf(orders);
        // printf(points);
        printf(codes);

        print(orders);
        printf(points);
        print(codes);
    }

    // Object + ... <--> Generic
    // --> Runtime
    // --> No restriction

    // Generic Type
    // Any name --> convention single letter E, T, R, Element
    // --> Compile
    // --> Restrict type as expected

    // Element extends CharSequence --> Element: CharSequence || sub class of
    // CharSequence
    private static <Element extends CharSequence> void printf(Element[] elements) {
        for (Element element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static <Element extends Number> void printf(Element[] elements) {
        for (Element element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Object[] elements = Integer[] orders;
    private static void print(Object[] elements) {
        for (Object element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
