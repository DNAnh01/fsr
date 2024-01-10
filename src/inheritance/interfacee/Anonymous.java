package inheritance.interfacee;

public abstract class Anonymous implements Shape {
    @Override
    public void draw() {
        System.out.println("Parent ===> drawing ...");
    }

    @Override
    public void calculate() {
        System.out.println("Parent ===> calculating ...");
    }

    @Override
    public void setBackground() {
        System.out.println("Red");
    }

    @Override
    public void setColor() {
        System.out.println("Red");
    }

    void normalMethod() {
        System.out.println("normal method ...");
    };
}
