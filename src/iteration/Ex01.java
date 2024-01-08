package iteration;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * 
         * @
         * @ @
         * @ @ @
         * @ @ @ @
         * @ @ @ @ @
         * 
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
        /**
         * @ @ @ @ @ @
         * @ @ @ @ @ @
         * @ @ @ @ @ @
         * @ @ @ @ @ @
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
        // X

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        String[] elements = {"aa", "bbbb", "ccc", "d"};
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
		for (String element: elements) {
			System.out.println(element);
		}
    }
}
