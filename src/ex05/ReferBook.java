package ex05;

public class ReferBook extends AbstractBook {
    private double taxPercentage;

    public ReferBook(
            String bookCode,
            double price,
            String publisher,
            double taxPercentage) {
        super(bookCode, price, publisher);
        this.taxPercentage = taxPercentage;
    }

    @Override
    public String getBookCode() {
        return bookCode;
    }

    @Override
    public double getPrice() {
        return price * (1 + taxPercentage / 100);
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

}
