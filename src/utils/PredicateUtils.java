package utils;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateUtils {
    private PredicateUtils() {

    }

    /**
     * Create predicate by property.
     * 
     * @param <T>  owner class type
     * @param <R>  property for distinct
     * @param func function
     * @return predicate by property
     */
    public static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
        Set<R> keys = new HashSet<>();
        return dish -> keys.add(func.apply(dish));

    }

}