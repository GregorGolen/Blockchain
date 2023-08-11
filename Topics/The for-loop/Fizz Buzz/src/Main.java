import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = begin; i <= end; i++){
            System.out.println((i%15==0) ? "FizzBuzz": (i%3==0) ? "Fizz" : (i%5==0) ? "Buzz": i);
        }
    }
}
