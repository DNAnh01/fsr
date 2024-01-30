package collection.map.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex04EmployeeApp {
    // List<T>#remove#contains
    // T override equals

    // Map<Entry<K, V>>#put
    // K#hashcode#equals

    // hashcode --> default is address --> integers
    // override hashcode phụ thuộc vào thuộc tính, giá trị của đối tượng (integers)
    public static void main(String[] args) {
        List<Employee> flist = Arrays.asList(new Employee(11, "A", 50, 1), new Employee(12, "B", 50, 1));
        List<Employee> slist = Arrays.asList(new Employee(21, "C", 30, 2), new Employee(22, "D", 10, 2));
        List<Employee> tlist = Arrays.asList(new Employee(31, "E", 10, 3), new Employee(32, "F", 10, 3));

        Map<Employee, List<Employee>> teams = new HashMap<>();
        teams.put(new Employee(1, "John", 100, null), flist); // new Employee(1, "John", 100, null) H1
        teams.put(new Employee(2, "Smith", 150, null), slist);
        teams.put(new Employee(3, "Andy", 200, null), tlist);

        teams.put(new Employee(1, "John1", 100, null), tlist); // new Employee(1, "John", 100, null) H2
        System.out.println("size: " + teams.size()); // 4 --> expected:3
    }
}
