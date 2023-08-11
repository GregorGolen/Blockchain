import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(euphoniousCheck(word));
    }

    static int euphoniousCheck(String word){
        int result = 0;
        int vowelRow = 0;
        int vowel2ndRow = 0;
        int conosonantRow = 0;
        int conosonat2ndRow = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');

        char[] array = word.toUpperCase().toCharArray();

        for(int i = 0; i < array.length; i++) {
            if(vowels.contains(Character.valueOf(array[i]))) {
                vowelRow++;
                if (vowelRow > 3) {
                   vowel2ndRow++;
                }
                conosonantRow = 0;
                conosonat2ndRow = 0;
                if( vowelRow >= 3 & vowelRow < 4) {
                    result++;
                }
                if (vowel2ndRow == 2) {
                    result++;
                    vowel2ndRow = 0;
                }
            } else {
                conosonantRow++;
                if(conosonantRow > 3) {
                    conosonat2ndRow++;
                }
                vowelRow = 0;
                vowel2ndRow = 0;
                if( conosonantRow >= 3 & conosonantRow < 4) {
                    result++;
                }
                if (conosonat2ndRow == 2) {
                    result++;
                    conosonat2ndRow = 0;
                }
            }
        }

        return result;
    }

}
