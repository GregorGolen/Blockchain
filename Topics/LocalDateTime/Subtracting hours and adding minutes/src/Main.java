import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataTimeStringInput = scanner.nextLine();
        LocalDateTime dt = LocalDateTime.parse(dataTimeStringInput);
        String dataS = scanner.nextLine();
        String[] t = dataS.split(" ");
        System.out.println(dt.minusHours(Long.parseLong(t[0])).plusMinutes(Long.parseLong(t[1])));// put your code here
    }
}
