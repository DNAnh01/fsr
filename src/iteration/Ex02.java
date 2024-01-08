package iteration;

public class Ex02 {
    public static void main(String[] args) {
		// Exp1
		int i = 0;

		// Exp2
		while (i < 10) {
			// statement
			System.out.println("i: " + i);

			// Exp3
			i++;
		}

		System.out.println("==================");

		// Exp1
		int k = 0;

		// Exp2
		while (true) {
			if (k == 10) {
				// Dừng - Thoát khỏi vòng while
				break;
			}

			// statement
			System.out.println("k: " + k);

			// Exp3
			k++;
		}

		System.out.println("=================>>>>");

	}
}
