package structure.bean;

public class Circle {
    public Point point;
    public float R;

    public Circle(Point point, float r) {
        this.point = point;
        R = r;
    }

    @Override
    public String toString() {
        return "Circle [point=" + point + ", R=" + R + "]";
    }

}
