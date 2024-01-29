package functional;

@FunctionalInterface
public interface Operator {
    public abstract int execute(int a, int b);
    // The target type of this expression must be a functional interface
    // public abstract int execute1(int a, int b);
}
