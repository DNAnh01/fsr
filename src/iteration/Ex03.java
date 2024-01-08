package iteration;

public class Ex03 {
    public static void main(String[] args) {
        // Exp1
        int i = 0;
        // Exp2
        do {
            // statement
            System.out.println("i: " + i);

            // Exp3
            i++;
        } while (i < 10);
        System.out.println("==================");
        // Exp1
        int k = 0;
        // Exp2
        do {
            if (k == 10) {
                // Dừng - Thoát khỏi vòng while
                break;
            }
            // statement
            System.out.println("k: " + k);
            // Exp3
            k++;
        } while (true);

        System.out.println("=================>>>>");

    }
}
