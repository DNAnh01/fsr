package ex01;

public class Student {
    private int id;
    private String fullName;
    private Point point;

    public Student() {
    }

    public Student(int id, String fullName, Point point) {
        this.id = id;
        this.fullName = fullName;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", fullName=" + fullName + ", point=" + point + "]";
    }
}
