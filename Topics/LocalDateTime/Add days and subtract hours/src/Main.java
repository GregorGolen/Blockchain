
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataStringInput = scanner.nextLine();
        String[] inputs = dataStringInput.split(" ");
        LocalDateTime dateTime = LocalDateTime.parse(inputs[0]);
/*        System.out.println(dateTime);
        System.out.println(inputs[1]);
        System.out.println(inputs[2]);*/
        LocalDateTime outputDateTime = dateTime.plusDays(Long.parseLong(inputs[1])).minusHours(Long.parseLong(inputs[2]));
        System.out.println(outputDateTime);
    }
}
