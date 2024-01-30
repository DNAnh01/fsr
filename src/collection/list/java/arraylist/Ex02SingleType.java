package collection.list.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleType {
    public static void main(String[] args) {
        List<Integer> yearOfBirths = new ArrayList<>();
        yearOfBirths.add(1999);
        yearOfBirths.add(2000);
        yearOfBirths.add(2001);

        // generic type --> catch error at compile time --> better
        // yearOfBirths.add("epoch");
        for (Integer year : yearOfBirths) {
            System.out.println("year of birth: " + year);
        }
    }
}
