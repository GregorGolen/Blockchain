import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(convert(input));
    }
    static String convert(String input) {
        String[] array = input.split("-");
        return array[1] + "/" + array[2] + "/"+ array[0];
    }
}
