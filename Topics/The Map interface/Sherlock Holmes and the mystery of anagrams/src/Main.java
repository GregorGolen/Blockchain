import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine().toLowerCase();
        String word2 = scanner.nextLine().toLowerCase();
        List<Character> list1 = word1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> list2 = word2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        if(list1.size() != list2.size()) {
            System.out.println("no");
        } else if(list1.containsAll(list2) && list2.containsAll(list1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
