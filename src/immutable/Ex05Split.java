package immutable;

import java.util.regex.Pattern;

public class Ex05Split {
    public static void main(String[] args) {
        // String s = "xin chao cac ban";
        String s = "Le Na, 034 898 2910, Nu, English";

        // String[] elements = s.split("\\s", 2);
        // String[] elements = s.split(",\\s");
        String[] elements = Pattern.compile(",\\s").split(s);

        for (String element : elements) {
            System.out.println(element);
        }
    }
}
