package polymorphism.object;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("3. Square ===> draw ....");
    }

    @Override
    void calculate() {
        System.out.println("3. Square calculate ===> x*x");
    }
}
