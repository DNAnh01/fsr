package structure;

public class Ex01TestMainMethod {
    // method
    public static void main(String[] args) {
        // ...println(content): In ra nội dung và xuống hàng
        System.out.println("Welcome to JAVA - Spring course");

        // call method
        // Ex01.anotherMain();
        Ex01TestMainMethod.anotherMain();
        Ex01TestMainMethod.anotherMethod();

        // error
        // Ex01TestMainMethod.otherMethod();

        // Class Ex01TestMainMethod
        // How to call a non-static method in class Ex01TestMainMethod
        // >> Initial an object from class Ex01TestMainMethod
        Ex01TestMainMethod object = new Ex01TestMainMethod();
        // >> Using created object to call non-static method
        object.otherMethod();
    }

    // [access modifier] [static] return_type method_name(parameters)
    public static void anotherMain() {
        System.out.println("Fake main method");
    }

    private static void anotherMethod() {
        System.out.println("Another Method");
    }

    // non-static
    @Deprecated
    private void otherMethod() {
        System.out.println("Other Method");
    }
}
