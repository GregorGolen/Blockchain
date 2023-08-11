import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataTimeStringInput = scanner.nextLine();
        LocalDateTime dt = LocalDateTime.parse(dataTimeStringInput);
        Long dif = dt
                .withMonth(1)
                .withDayOfMonth(1)
                .withHour(0)
                .withMinute(0)
                .until(dt, ChronoUnit.HOURS);

        System.out.println(dif);
    }
}
