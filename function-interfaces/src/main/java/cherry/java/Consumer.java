package cherry.java;

import android.support.annotation.NonNull;

/**
 * Created by ROOT on 2017/8/16.
 */
public interface Consumer<T> {
    void accept(@NonNull T t);
}
