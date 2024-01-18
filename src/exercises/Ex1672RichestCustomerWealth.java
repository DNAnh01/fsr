package exercises;

public class Ex1672RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int totalCustomer = accounts.length;
        int maximumWealth = Integer.MIN_VALUE;
        for (int i = 0; i < totalCustomer; i++) {
            int totalAmountOfEachCustomer = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalAmountOfEachCustomer += accounts[i][j];
            }
            maximumWealth = Math.max(maximumWealth, totalAmountOfEachCustomer);
        }
        return maximumWealth;
    }

    private static void printAccounts(int[][] accounts) {
        for (int[] arr : accounts) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        int[][] accounts2 = { { 1, 5 }, { 7, 3 }, { 3, 5 }, { 1 } };
        printAccounts(accounts2);
        System.out.println(maximumWealth(accounts2));
        ;

    }
}
