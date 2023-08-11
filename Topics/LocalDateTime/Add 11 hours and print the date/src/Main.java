
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataTimeStringInput = scanner.nextLine();
        LocalDateTime dt = LocalDateTime.parse(dataTimeStringInput).plusHours(11);
        System.out.println(dt.toLocalDate());
    }
}
