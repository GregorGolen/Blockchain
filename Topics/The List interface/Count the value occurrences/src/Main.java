import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int n1 = 0;
        int n2 = 0;

        for(Integer e : list1) {
            if (e == elem) {
                n1++;
            }
        }

        for(Integer e : list2) {
            if (e == elem) {
                n2++;
            }
        }

        if (n1 == n2) {
            return true;
        }
        return false;
    }
}
