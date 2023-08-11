import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStringInput = scanner.nextLine();
        LocalDate dateInput = LocalDate.parse(dateStringInput);

        System.out.println(dateInput.minusYears(30));// put your code here
        System.out.println(dateInput.plusYears(30));// put your code here
    }
}
