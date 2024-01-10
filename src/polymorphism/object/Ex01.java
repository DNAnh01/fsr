package polymorphism.object;

public class Ex01 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw(); // 1

        Square square = new Square();
        square.draw(); // 3

        Rectangle rectangle = new Rectangle();
        rectangle.draw(); // 2

        // PMO: Xảy ra khi có class con kế thừa từ class cha
        // Process: Compile, Runtime(new)
        // Compile: s1 --> Shape
        // Runtime: s1 --> Square
        // s1.draw(): compile: Shape
        // : draw: Square
        System.out.println("=========== PMO ===========");
        Shape s1 = new Square();
        s1.draw(); // 3
        // Tương lai: Trở thành Rectangle
        // : draw Rectangle

        Shape s2 = new Rectangle();
        s2.draw(); // 2

        s1 = s2;
        s1.draw();

        // Tại sao mình không new đối tượng trực tiếp từ KDL của nó
        // mà phải lấy Cha new Con
        // Cha-Con, !Anh-Em
        // 1. Dễ dàng ép kiểu qua về giữa những KDL của lớp con lúc runtime
        // 2. Tạo ra 1 mảng Shape vừa có thể là Square vừa là Rectangle
        // 3. Factory Pattern

        // Input: Danh sách, mảng gồm n hình(vuông, chữ nhật, tròn)
        // Output: Tính diện tích của các hình
        Shape s3 = new Square();
        Shape s4 = new Square();
        Shape s5 = new Square();
        // Shape[] squares = {s3,s4,s5};
        // for (Square si: squares) {
        // si.calculate();
        // }

        Shape s6 = new Rectangle();
        Shape s7 = new Rectangle();
        // Shape[] rectangles = {s6, s7};
        // for (Rectangle ri: rectangles) {
        // ri.calculate();
        // }

        // Cách làm ===>
        Shape[] shapes = { s3, s4, s5, s6, s7 };
        for (int i = 0; i < shapes.length; i++) {
            System.out.print("i" + i + ">> ");
            shapes[i].calculate();
        }

        // Child extends Parent
        // Child a = new Child();
        // Parent b = new Parent();
        // Child a1 = new Parent(); NO(Runtime)
        // Parent a2 = new Child();

        // Vì sao ko thể lấy con new cha --> Vì lúc compile có thể gọi đến hàm mở rộng
        // của con
        // nhưng lúc runtime k thể gọi đến hàm này dc, vì cha k có hàm mở rộng của con
        Rectangle r1 = (Rectangle) new Shape();
        r1.setBackground();

        // Ngược lại cha new con với hàm mở rộng
        // Shape sx = new Rectangle();
        // sx.clear();
    }
}