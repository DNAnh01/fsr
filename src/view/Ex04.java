package view;

public class Ex04 {
    private int a;
    private int b;

    public Ex04(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Ex04 e1 = new Ex04(2, 4);
        System.out.println(e1.sum());

        Ex04 e2 = new Ex04(3, 4);
        System.out.println(e2.sum());
    }

    private int sum() {
        return a + b;
    }
}
