package bean;

public class Rectangle {
    // attributes
    // access modifier >>> private || public
    private int width;
    private int height;

    // Constructor empty
    public Rectangle() {
    }

    // Constructor full parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // getter, setter
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
