package view;

public class Ex03UsingLocalVariable {
    // 1.2 -> global scope
    // Biến này được khai báo với phạm vi toàn cục, có thể truy cập và thay đổi từ
    // bất kỳ vị trí nào trong chương trình.
    private static String running10Km = "running 10km";

    public static void main(String[] args) {
        run(20);
    }

    private static Runnable run(int time) {
        // enclosing scope
        // 1.1 -> outer scope --> out of lambda expression, but inside of current
        // function
        String running5Km = "running 5km";

        // (X)lambda expression - anonymous class - implementation class
        // scope: (X) has difference scope with current class
        // require
        // 1.1 --> variables must be(implicitly) final
        // 1.2 --> changing arbitrary
        return () -> {
            // running5Km = "50km";
            Ex03UsingLocalVariable.running10Km = "100km";

            // inner scope
            String student = "Nam";
            System.out.println(student + " is " + running5Km + " in " + time + "(m)");
            System.out.println(student + " is " + running10Km + " in " + time * 2 + "(m)");
        };
    }
}
