package bean;

public class Car {

    public static String model;

    private String serial;
    private String color;
    private double price;

    public Car() {
    }

    public Car(String serial, String color) {
        this.serial = serial;
        this.color = color;
    }

    public Car(String serial, String color, double price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", serial=" + serial + ", color=" + color + ", price=" + price + "]";
    }
}
