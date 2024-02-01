package bean;

public class Dish {
    public enum Kind {
        MEAT, FISH, OTHER
    }

    private String id;
    private String name;
    private double calories;
    private Kind kind;
    private boolean vegetarian;

    public Dish() {
    }

    public Dish(String id, String name, double calories, Kind kind, boolean vegetarian) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.kind = kind;
        this.vegetarian = vegetarian;
    }

    public Dish(String id, String name, Kind kind) {
        this.id = id;
        this.name = name;
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", kind=" + kind + ", vegetarian="
                + vegetarian + "]";
    }

    @Override
    public int hashCode() {
        return (this.getId() +
                this.getName() +
                this.getKind() +
                this.getCalories() + "").hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dish)) {
            return false;
        }
        Dish other = (Dish) obj;

        return this.getId() == other.getId() &&
                this.getName() == other.getName() &&
                this.getKind() == other.getKind() &&
                this.getCalories() == other.getCalories();
    }

    public static boolean isMeat(Dish dish) {
        return Kind.MEAT.equals(dish.getKind());
    }
}
