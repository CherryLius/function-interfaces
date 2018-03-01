package java.ext.function;

/**
 * Created by ROOT on 2017/8/16.
 */
public interface Consumer<T> {
    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(T t);
}
