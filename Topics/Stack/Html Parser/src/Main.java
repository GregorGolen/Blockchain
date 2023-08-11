import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
/*        String string = "";

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            string += scanner.nextLine();
        }*/

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] html = string.toCharArray();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        boolean flag = false;

        for (int i = 0; i < html.length; i++) {
            if (html[i] == '>' && !flag) {
                deque.addLast(i + 1);
            } else if (html[i] == '/') {
                flag = true;
                System.out.println(string.substring(deque.pollLast(), i - 1));
            } else if (html[i] == '>' && flag) {
                flag = false;
            }
        }
    }
}
