import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DiffPossible {

    static int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> visited = new HashSet<>();
        for (Integer number: visited) {
            if (visited.contains(number-B) || visited.contains(number+B)){
                return 1;
            }
            visited.add(number);
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        //System.out.println(list);
        System.out.println(diffPossible(list,0));
    }
}
