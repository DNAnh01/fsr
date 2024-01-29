package functional;

// Strategy, Predicate --> any name
// test, isValid --> any name
// functional interface: interface with ONE abstract method
// functional interface can be replaced by a lambda expression
// lambda expression: is a shorten way to create, initial an object for function interface
// lambda: anonymous function
// parameter: number of parameters of abstract method
// + could remove parameter type for shorten way
// + could remove () if only has one parameter

// body: override of abstract method
// + could be remove {} and 'return' if body only has one line of code
// (parameters) -> {
//      body
// }

//@FunctionalInterface: Annotation này đánh dấu đây là một functional interface, nghĩa là chỉ chứa một phương thức abstract.
@FunctionalInterface
public interface Predicate {
    boolean isValid(int input);

    // void hello();
    default void x() {
    }

    static int y() {
        return 0;
    }
}
