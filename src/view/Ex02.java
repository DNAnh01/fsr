package view;

import bean.Car;

public class Ex02 {
    public static void main(String[] args) {
        Car.model = "Audi";
        Car c1 = new Car("Car 1", "Red");

        c1.model = "Mazda";

        Car c2 = new Car("Car 2", "Black");
        Car c3 = new Car("Car 3", "White");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("================");

        Car.model = "Vni";
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
