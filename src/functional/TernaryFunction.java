package functional;

@FunctionalInterface
public interface TernaryFunction<A, B, C, D> {
    D apply(A a, B b, C c);
}
