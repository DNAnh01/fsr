package declaration;

public class Ex01ArrayObjectType {
    public static void main(String[] args) {
        // JAVA types: class, enum, interface, abstract-class ==> object type
        // kiểu dữ liệu trong Java đều là kiểu đối tượng, bao gồm lớp, enum, giao diện
        // và lớp trừu tượng.
        // object type: extends Object -- int[] --> class [I extends Object
        // Nhấn mạnh mảng cũng là kiểu đối tượng, có lớp cha là Object.

        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("ToString:" + numbers.toString());
        System.out.println("Class:" + numbers.getClass().getName());

        System.out.println("===================");

        String[] sequences = { "a", "b", "c" };
        System.out.println("ToString:" + sequences.toString());
        System.out.println("Class:" + sequences.getClass().getName());

    }
}
