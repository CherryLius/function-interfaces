package ext.java8.function;

/**
 * Created by ROOT on 2017/9/29.
 */

public interface BiConsumer<T, U> {
    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     */
    void apply(T t, U u);
}
