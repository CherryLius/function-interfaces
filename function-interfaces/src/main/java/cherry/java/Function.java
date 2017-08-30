package cherry.java;

import android.support.annotation.NonNull;

public interface Function<T, R> {
    /**
     * Apply some calculation to the input value and return some other value.
     *
     * @param t the input value
     * @return the output value
     */
    R apply(@NonNull T t);
}
