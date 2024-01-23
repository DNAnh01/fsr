package ex05;

public class BookStoreSimulation {

    public static void main(String[] args) {
        Book[] books = {
                new TextBook("SGK001", 150, "Nhi Đồng", false),
                new TextBook("SGK002", 120, "Giao Đức", true),
                new TextBook("SGK003", 180, "Nhi Đồng", true),
                new ReferBook("STK001", 80, "Kim Đồng", 10),
                new ReferBook("STK002", 90, "Giao Đức", 8)
        };

        // Tạo cửa hàng sách
        BookStore bookStore = new BookStore(books);
        // Thực hiện các yêu cầu
        bookStore.findBooksByPublisher("Nhi Đồng");
        System.out.println("--------------");
        bookStore.findBooksUnderPrice(50);
        System.out.println("--------------");
        bookStore.findTextBooksInRange(100, 200);
        System.out.println("--------------");
        double totalPayment = bookStore.calculateTotalPayment();
        System.out.println("Tổng tiền khách hàng phải thanh toán: " + totalPayment + " VND");
    }
}
