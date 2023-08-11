// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    public static <T> T[] invert(T[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            T temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
