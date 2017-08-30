package cherry.java;

import android.support.annotation.NonNull;

/**
 * Created by ROOT on 2017/8/15.
 */

public interface Predicate<T> {
    boolean test(@NonNull T t);
}