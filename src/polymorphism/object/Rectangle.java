package polymorphism.object;

public class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("2. Rectangle ===> draw ....");
    }

    @Override
    void calculate() {
        System.out.println("2. Rectangle calculate ===> width * height");
    }

    void setBackground() {
        System.out.println("2. Rectangle ===> setBackground");
    }
}