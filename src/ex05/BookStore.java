package ex05;

public class BookStore {
    private Book[] books;

    public BookStore(Book[] books) {
        this.books = books;
    }

    // Các phương thức thực hiện các yêu cầu của đề bài

    public void findBooksByPublisher(String publisher) {
        System.out.println("Sách thuộc nhà xuất bản " + publisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.getBookCode() + ": " + book.getPrice() + " VND");
            }
        }
    }

    public void findBooksUnderPrice(double maxPrice) {
        System.out.println("Sách có đơn giá nhỏ hơn " + maxPrice + ":");
        for (Book book : books) {
            if (book.getPrice() < maxPrice) {
                System.out.println(book.getBookCode() + ": " + book.getPrice() + " VND");
            }
        }
    }

    public void findTextBooksInRange(double minPrice, double maxPrice) {
        System.out.println("Sách giáo khoa có đơn giá từ " + minPrice + " đến " + maxPrice + ":");
        for (Book book : books) {
            if (book instanceof TextBook && book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                System.out.println(book.getBookCode() + ": " + book.getPrice() + " VND");
            }
        }
    }

    public double calculateTotalPayment() {
        double totalPayment = 0;
        for (Book book : books) {
            totalPayment += book.getPrice();
        }
        return totalPayment;
    }
}
