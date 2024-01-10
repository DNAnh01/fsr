package encapsulation.external;

import java.util.Arrays;

import encapsulation.internal.Employee;

public class Company {
    public String name() {
        return "IT-DEV";
    }

    public int numberOfEmployees() {
        return 230;
    }

    private String[] customers() {
        return new String[] { "HP", "ASUS" };
    }

    public static void main(String[] args) {
        Company company = new Company();
        System.out.println("name: " + company.name());
        System.out.println("length: " + company.customers().length);
        System.out.println(Arrays.toString(company.customers()));

        Employee employee = new Employee();
        System.out.println("employee name: " + employee.name());
    }
}
