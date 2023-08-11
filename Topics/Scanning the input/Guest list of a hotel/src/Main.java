import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        String s4 = scanner.next();
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
