package generic.type;

import java.util.function.Predicate;

public interface IList<E> {
    boolean isEmpty();

    boolean isNotEmpty();

    boolean add(E e);

    boolean remove(int i);

    boolean remove(E e);

    void set(int i, E e);

    void show();

    int size();

    int count(Predicate<E> predicate);

    E get(int i);
}
