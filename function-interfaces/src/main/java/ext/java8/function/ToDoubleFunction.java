package ext.java8.function;

/**
 * Created by ROOT on 2017/9/29.
 */

public interface ToDoubleFunction<T> {
    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     */
    double applyAsDouble(T value);
}
