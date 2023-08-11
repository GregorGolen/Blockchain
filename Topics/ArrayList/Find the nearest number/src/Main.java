import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listString = Arrays.asList((scanner.nextLine().split("\\s+")));
        Integer givenInt = Integer.parseInt(scanner.nextLine());
        List<Integer> list = listString.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        ArrayList<Integer> result = new ArrayList<>();
        Integer diff = Integer.MAX_VALUE;
        for (Integer e : list) {
            if (Math.abs(e - givenInt) == diff) {
                result.add(e);
            }
            if (Math.abs(e - givenInt) < diff) {
                diff = Math.abs(e - givenInt);
                result.clear();
                result.add(e);
            }
            Collections.sort(result);
        }
        for(Integer e : result) {
            System.out.print(e + " ");
        }
    }
}
