package interview;

public class Student extends Person {
    // this, super

    // super.printAge
    // super.printFullName ==> Person || Student . printFullName

    // static: Class.staticMethod(), new Class().staticMethod(); ==> warning

    // non-static: new Class().nonStaticMethod();

    // Không cho phép override static method vì nó thuộc phạm vi của class
    // Muốn gọi thì lấy class con hoặc cha chấm trực tiếp

    // Override những non-static method vì nó thuộc phạm vi của đối tượng
    // có thể lấy cha new con, lúc compile gọi hàm của cha lúc runtime gọi hàm của
    // con đã override

    public static void main(String[] args) {
        Student.printFullName("name");
    }

}