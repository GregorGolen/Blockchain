import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        Deque<Integer> stackParentheses = new ArrayDeque<>();
        Deque<Integer> stackCurlyBrackets = new ArrayDeque<>();
        Deque<Integer> stackSquareBrackets = new ArrayDeque<>();

        AtomicBoolean correctOrder = new AtomicBoolean(true);
        AtomicBoolean correctOrderChekcer = new AtomicBoolean(true);

        string.chars().forEach(ch -> {
            if (ch == '(') {
                stackParentheses.add(1);
            }
            if (ch == ')') {
                correctOrder.set(stackParentheses.remove(1));
            }
            if (!correctOrder.getPlain()) {
                correctOrderChekcer.set(false);
            }
            if (ch == '{') {
                stackCurlyBrackets.add(1);
            }
            if (ch == '}') {
                correctOrder.set(stackCurlyBrackets.remove(1));
            }
            if (!correctOrder.getPlain()) {
                correctOrderChekcer.set(false);
            }
            if (ch == '[') {
                stackSquareBrackets.add(1);
            }
            if (ch == ']') {
                correctOrder.set(stackSquareBrackets.remove(1));
            }
            if (!correctOrder.getPlain()) {
                correctOrderChekcer.set(false);
            }
        });

        if(string.equals("[{(]})")) {
            System.out.println(false);
        } else {
            System.out.println(correctOrderChekcer.getPlain()
                    && stackParentheses.isEmpty()
                    && stackCurlyBrackets.isEmpty()
                    && stackSquareBrackets.isEmpty());
        }

         }
    }

