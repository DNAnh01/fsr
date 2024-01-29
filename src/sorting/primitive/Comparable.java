package sorting.primitive;

@FunctionalInterface
public interface Comparable {

    boolean compare(int pre, int next);

    // Có thể chứa hàm trừu tượng và hàm có thân với từ khóa default, static, và
    // private (từ Java 9).

    // (pre, next) -> pre > next
    static boolean asc(int pre, int next) {
        return pre > next;
    }

    // (pre, next) -> pre < next
    static boolean desc(int pre, int next) {
        return pre < next;
    }
}
