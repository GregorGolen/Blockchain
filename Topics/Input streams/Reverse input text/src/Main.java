import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder content = new StringBuilder();
        int value;

        while ((value = reader.read()) != -1) {
            content.append((char) value);
        }
        reader.close();

        System.out.println(content.reverse().toString());
    }
}
