import java.util.*;

public class Main {

    public static void main(String[] args) {    
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Alpha",  1);
        map.put("Gamma",  3);
        map.put("Omega", 24);

        System.out.println(map);
    }
}
