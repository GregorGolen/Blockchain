import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int sum = 1;
        for (int i = i1; i < i2; i++) {
            sum *= i;
        }
        System.out.println(sum);

    }
}
