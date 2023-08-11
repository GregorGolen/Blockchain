import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer dimension = Integer.valueOf(scanner.nextLine());

        String[] arrStrings = new String[dimension];
        Boolean isSquare = true;

        for(int i = 0; i < dimension; i++){
            arrStrings[i] = scanner.nextLine();
        }
        for(int i = arrStrings.length -1; i > 0; i--){
            if(arrStrings[i].length() != arrStrings[i-1].length()){
            isSquare = false;
                System.out.println("NO");
            }
        }

        Integer[][] matrix = new Integer[dimension][dimension];
        if(isSquare){
            for(int i = 0; i < arrStrings.length; i++){
                List<Integer> oneDim = Arrays.stream(arrStrings[i].split(" ")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());
                if(oneDim.size() != dimension) {
                    isSquare = false;
                    break;
                }
                for(int j = 0; j < oneDim.size(); j++){
                    matrix[i][j] = oneDim.get(j);
                }
            }
            outerloop:
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if (matrix[i][j] != matrix[j][i]){
                        isSquare = false;
                        break outerloop;
                    }
                }
            }
            if(isSquare){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
