import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String busParamLine = scanner.nextLine();
        String bridgesLine = scanner.nextLine();

        String[] busParamTab = busParamLine.split(" ");
        List<Integer> bridges = Arrays.stream(bridgesLine.split(" ")).map(num -> Integer.parseInt(num)).collect(Collectors.toList());

        String info = "Will not crash";
        int i = 1;
        for(Integer b : bridges){
            if(b <= Integer.parseInt(busParamTab[0])){
                info = "Will crash on bridge " + i;
                break;
            }
            i++;
        }
        System.out.println(info);
    }
}
