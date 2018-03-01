package java.ext.function;

/**
 * Created by ROOT on 2017/9/29.
 */

public interface ToIntFunction<T> {
    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     */
    int applyAsInt(T value);
}
