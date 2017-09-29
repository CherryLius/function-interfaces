package cherry.java;

/**
 * Created by ROOT on 2017/8/30.
 */
public interface Supplier<T> {
    /**
     * Gets a result.
     *
     * @return a result
     */
    T get();
}
