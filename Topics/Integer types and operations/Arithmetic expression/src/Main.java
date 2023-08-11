import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        System.out.println(((n + 1) * n + 2) * n + 3);
    }
}
