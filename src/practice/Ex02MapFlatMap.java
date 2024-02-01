package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02MapFlatMap {
    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 5, 6, 7 }
        };

        Arrays.stream(matrix) // Stream<Integer[]>
                .flatMap(Arrays::stream) // Stream<Integer>
                .distinct()
                .filter(num -> (num % 2 != 0))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("------------");

        int[][] primitiveMatrix = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 5, 6, 7 }
        };
        Arrays.stream(primitiveMatrix)
                .flatMapToInt(array -> {
                    List<Integer> rs = new ArrayList<>();
                    for (int num : array) {
                        rs.add(num);
                    }
                    return rs.stream().mapToInt(Integer::intValue);
                })
                .distinct()
                .filter(digit -> (digit % 2 != 0))
                .forEach(System.out::println);
        System.out.println("--------------");
        Arrays.stream(primitiveMatrix) // Stream<int[]>
                .flatMapToInt(array -> Arrays.stream(array))// IntStream
                .filter(digit -> digit % 2 != 0)
                .distinct()
                .forEach(digit -> System.out.print(digit + " "));

    }
}
