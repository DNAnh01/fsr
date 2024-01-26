package ex03;

import java.util.Arrays;

public class RevertString {
    public static void main(String[] args) {
        String s = "Welcome to JAVA14 class";
        System.out.println(revert(s));
    }

    private static String revert(String s) {
        StringBuilder rs = new StringBuilder("");
        String[] cuts = s.split("\\s+");
        System.out.println(Arrays.toString(cuts));
        for (String cut : cuts) {
            StringBuilder bd = new StringBuilder(cut);
            rs.append(bd.reverse() + " ");
        }
        return rs.toString().trim();
    }
}
