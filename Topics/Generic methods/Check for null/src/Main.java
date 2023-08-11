// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ArrayUtils {
    public static <T> boolean hasNull (T[] list) {
        List<T> al = Arrays.stream(list).filter(Predicate.isEqual(null)).collect(Collectors.toList());
        return (al.size() > 0);
    }
}

/*class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {arr.add(scanner.nextLine()); }
        while (scanner.hasNextLine());

        System.out.println(ArrayUtils.hasNull(arr));
    }
}*/
