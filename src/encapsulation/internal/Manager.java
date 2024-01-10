package encapsulation.internal;

public class Manager {

    public String name() {
        return "Tosten";
    }

    private double salary() {
        return 20000d;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("name: " + employee.name());
        System.out.println("salary: " + employee.salary());
    }
}