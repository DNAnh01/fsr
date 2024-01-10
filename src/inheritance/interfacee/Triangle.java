package inheritance.interfacee;

public class Triangle implements Shape {
    // class implement interface
    // required: override all abstract methods from interface

    @Override
    public void draw() {
        System.out.println("Triangle ===> drawing ...");
    }

    @Override
    public void calculate() {
        System.out.println("Triangle ===> calculating ...");
    }

    @Override
    public void setBackground() {
        System.out.println("Blue");
    }

    @Override
    public void setColor() {
        System.out.println("Blue");
    }
}