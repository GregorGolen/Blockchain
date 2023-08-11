// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ArrayUtils {
    public static <T> String info(T[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        Arrays.stream(arr).forEach(e -> e.toString().replaceAll("\"", ""));
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result += arr[i];
            } else if (i == (arr.length - 1)) {
                result += ", " + arr[i];
            } else {
                result += ", " + arr[i];
            }
        }
        return result + "]";
    }
}
