package polymorphism.method;

/**
 * Polymorphims
 * 
 * ---> Method Override
 * ---> 2, nhiều hàm được gọi là override khi nào
 * + Thuộc 2 classes có quan hệ thừa kế với nhau
 * + Class con override, định nghĩa lại nội dung của method trong class cha
 */
public class Ex02 {
    public static void main(String[] args) {
        Developer developer = new Developer();
        System.out.println("developer: " + developer.skills());

        Tester tester = new Tester();
        System.out.println("tester: " + tester.skills());
    }
}