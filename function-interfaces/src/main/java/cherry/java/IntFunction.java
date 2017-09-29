package cherry.java;

/**
 * Created by ROOT on 2017/9/29.
 */

public interface IntFunction<R> {
    /**
     * Applies this function to the given argument.
     *
     * @param value the function argument
     * @return the function result
     */
    R apply(int value);
}
