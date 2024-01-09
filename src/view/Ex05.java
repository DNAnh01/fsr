package view;

public class Ex05 {
    // static will construct before non-static

    public static void main(String[] args) {
        show();

        // sum(1, 2); error
    }

    private static void show() {
        System.out.println("show is static method !");
    }

    private int sum(int a, int b) {
        show();
        return a + b;
    }
}
