package structure.bean;

public enum CirclePosition {
    // enum constant
    INSIDE("Inside the circle"),
    ONSIDE("On the circle"),
    OUTSIDE("Outside the circle");

    public String value;

    CirclePosition(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
