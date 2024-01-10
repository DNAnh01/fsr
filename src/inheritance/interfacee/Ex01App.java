package inheritance.interfacee;

public class Ex01App {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.calculate();

        System.out.println("===============");

        Shape shape = new Triangle();
        shape.draw();
        shape.calculate();
        System.out.println("===============");
        // Shape parent = new Shape();
        // anonymous class
        Shape parent = new Anonymous() {

            @Override
            public void setColor() {
                System.out.println("===");
            }

            @Override
            public void setBackground() {
                System.out.println("===");
            }

        };
        parent.draw();
        parent.calculate();
        parent.setBackground();

        // Shape shape2 = new Anonymous(); khong the tao moi mot doi tuong tu mot lop
        // truu tuong

        // How to construct an instance of interface
        // Option 1: new interface directly and use anonymous class
        // Option 2: create child class implements from interface
        // and then use interface = new child class

    }
}
