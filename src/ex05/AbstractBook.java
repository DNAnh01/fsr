package ex05;

// lớp cha chung cho sách giáo khoa và sách tham khảo
public abstract class AbstractBook implements Book {
    protected String bookCode;
    protected double price;
    protected String publisher;

    public AbstractBook(String bookCode, double price, String publisher) {
        this.bookCode = bookCode;
        this.price = price;
        this.publisher = publisher;
    }
}
