package view;

public class Ex02FunctionDescriptor {
    public static void main(String[] args) {
        run(() -> System.out.println("Running  ... "));
    }

    private static void run(Runnable runnable) {
        runnable.run();
    }
}
