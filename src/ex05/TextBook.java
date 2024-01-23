package ex05;

public class TextBook extends AbstractBook {

    private boolean isNew;

    public TextBook(
            String bookCode,
            double price,
            String publisher,
            boolean isNew) {
        super(bookCode, price, publisher);
        this.isNew = isNew;
    }

    @Override
    public String getBookCode() {
        return bookCode;
    }

    @Override
    public double getPrice() {
        return isNew ? price : 0.7 * price;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }
}
