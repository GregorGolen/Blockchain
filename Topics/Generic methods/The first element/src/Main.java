// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
     public static <T> T getFirst (T[] list) {
         if(list.length > 0) {
             return list[0];
         } else {
             return null;
         }
     }
}
