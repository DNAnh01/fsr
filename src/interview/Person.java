package interview;

public class Person {

    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    void printAge() {
        System.out.println(age);
    }

    static void printFullName(String fullname) {
        System.out.println(fullname);
    }

}